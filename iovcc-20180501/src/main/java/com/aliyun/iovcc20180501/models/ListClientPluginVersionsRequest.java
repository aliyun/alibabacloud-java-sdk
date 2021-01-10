// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListClientPluginVersionsRequest extends TeaModel {
    @NameInMap("OsType")
    public String osType;

    @NameInMap("PkgName")
    public String pkgName;

    public static ListClientPluginVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClientPluginVersionsRequest self = new ListClientPluginVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListClientPluginVersionsRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListClientPluginVersionsRequest setPkgName(String pkgName) {
        this.pkgName = pkgName;
        return this;
    }
    public String getPkgName() {
        return this.pkgName;
    }

}
