// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisplayNameFilter extends TeaModel {
    /**
     * <p>Returns only resources whose display name contains the specified string. The match is case-sensitive.</p>
     */
    @NameInMap("contains")
    public String contains;

    /**
     * <p>Returns only resources whose display name does not contain the specified string. The match is case-sensitive.</p>
     */
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
