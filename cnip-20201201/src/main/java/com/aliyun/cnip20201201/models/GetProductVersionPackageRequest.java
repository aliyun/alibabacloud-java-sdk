// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionPackageRequest extends TeaModel {
    @NameInMap("platform")
    public String platform;

    @NameInMap("packageType")
    public String packageType;

    @NameInMap("oldProductVersionUID")
    public String oldProductVersionUID;

    public static GetProductVersionPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPackageRequest self = new GetProductVersionPackageRequest();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPackageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GetProductVersionPackageRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public GetProductVersionPackageRequest setOldProductVersionUID(String oldProductVersionUID) {
        this.oldProductVersionUID = oldProductVersionUID;
        return this;
    }
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

}
