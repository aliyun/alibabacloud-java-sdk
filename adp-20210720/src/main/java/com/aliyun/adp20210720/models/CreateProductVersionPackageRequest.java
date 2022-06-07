// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductVersionPackageRequest extends TeaModel {
    // ENUM["TRIDENT","ACK-D"]
    @NameInMap("clusterEngineType")
    public String clusterEngineType;

    @NameInMap("oldProductVersionUID")
    public String oldProductVersionUID;

    // ENUM:["all","base"."application"]
    @NameInMap("packageContentType")
    public String packageContentType;

    // "ENUM value: ["Hopctl", "Sealer"]"
    @NameInMap("packageToolType")
    public String packageToolType;

    // ENUM:["full","upgrade"]
    @NameInMap("packageType")
    public String packageType;

    @NameInMap("platform")
    public String platform;

    public static CreateProductVersionPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductVersionPackageRequest self = new CreateProductVersionPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductVersionPackageRequest setClusterEngineType(String clusterEngineType) {
        this.clusterEngineType = clusterEngineType;
        return this;
    }
    public String getClusterEngineType() {
        return this.clusterEngineType;
    }

    public CreateProductVersionPackageRequest setOldProductVersionUID(String oldProductVersionUID) {
        this.oldProductVersionUID = oldProductVersionUID;
        return this;
    }
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

    public CreateProductVersionPackageRequest setPackageContentType(String packageContentType) {
        this.packageContentType = packageContentType;
        return this;
    }
    public String getPackageContentType() {
        return this.packageContentType;
    }

    public CreateProductVersionPackageRequest setPackageToolType(String packageToolType) {
        this.packageToolType = packageToolType;
        return this;
    }
    public String getPackageToolType() {
        return this.packageToolType;
    }

    public CreateProductVersionPackageRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateProductVersionPackageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
