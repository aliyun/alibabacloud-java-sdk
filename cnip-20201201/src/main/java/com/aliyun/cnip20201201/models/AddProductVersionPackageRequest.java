// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddProductVersionPackageRequest extends TeaModel {
    // 环境UID（Deprecated)）
    @NameInMap("envUID")
    public String envUID;

    // ENUM:["full","upgrade"]
    @NameInMap("packageType")
    public String packageType;

    // ENUM:["all","base"."application"]
    @NameInMap("packageContentType")
    public String packageContentType;

    public static AddProductVersionPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductVersionPackageRequest self = new AddProductVersionPackageRequest();
        return TeaModel.build(map, self);
    }

    public AddProductVersionPackageRequest setEnvUID(String envUID) {
        this.envUID = envUID;
        return this;
    }
    public String getEnvUID() {
        return this.envUID;
    }

    public AddProductVersionPackageRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public AddProductVersionPackageRequest setPackageContentType(String packageContentType) {
        this.packageContentType = packageContentType;
        return this;
    }
    public String getPackageContentType() {
        return this.packageContentType;
    }

}
