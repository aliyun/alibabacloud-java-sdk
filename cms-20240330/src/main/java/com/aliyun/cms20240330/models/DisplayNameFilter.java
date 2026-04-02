// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisplayNameFilter extends TeaModel {
    @NameInMap("contains")
    public String contains;

    @NameInMap("notContains")
    public String notContains;

    public static DisplayNameFilter build(java.util.Map<String, ?> map) throws Exception {
        DisplayNameFilter self = new DisplayNameFilter();
        return TeaModel.build(map, self);
    }

    public DisplayNameFilter setContains(String contains) {
        this.contains = contains;
        return this;
    }
    public String getContains() {
        return this.contains;
    }

    public DisplayNameFilter setNotContains(String notContains) {
        this.notContains = notContains;
        return this;
    }
    public String getNotContains() {
        return this.notContains;
    }

}
