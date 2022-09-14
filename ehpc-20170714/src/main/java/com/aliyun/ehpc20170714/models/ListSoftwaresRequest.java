// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class ListSoftwaresRequest extends TeaModel {
    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    public static ListSoftwaresRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSoftwaresRequest self = new ListSoftwaresRequest();
        return TeaModel.build(map, self);
    }

    public ListSoftwaresRequest setEhpcVersion(String ehpcVersion) {
        this.ehpcVersion = ehpcVersion;
        return this;
    }
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

}
