// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListClientPluginsRequest extends TeaModel {
    @NameInMap("OsType")
    public String osType;

    public static ListClientPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClientPluginsRequest self = new ListClientPluginsRequest();
        return TeaModel.build(map, self);
    }

    public ListClientPluginsRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

}
