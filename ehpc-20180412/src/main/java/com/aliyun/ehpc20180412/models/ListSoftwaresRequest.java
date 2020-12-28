// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListSoftwaresRequest extends TeaModel {
    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    @NameInMap("OsTag")
    public String osTag;

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

    public ListSoftwaresRequest setOsTag(String osTag) {
        this.osTag = osTag;
        return this;
    }
    public String getOsTag() {
        return this.osTag;
    }

}
