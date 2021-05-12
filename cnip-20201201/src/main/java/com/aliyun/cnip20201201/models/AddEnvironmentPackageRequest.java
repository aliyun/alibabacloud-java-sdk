// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddEnvironmentPackageRequest extends TeaModel {
    @NameInMap("packageType")
    public String packageType;

    public static AddEnvironmentPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentPackageRequest self = new AddEnvironmentPackageRequest();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentPackageRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

}
