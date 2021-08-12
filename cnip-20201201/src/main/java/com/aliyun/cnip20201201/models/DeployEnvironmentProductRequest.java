// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeployEnvironmentProductRequest extends TeaModel {
    // 部署包uid
    @NameInMap("packageUID")
    public String packageUID;

    public static DeployEnvironmentProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployEnvironmentProductRequest self = new DeployEnvironmentProductRequest();
        return TeaModel.build(map, self);
    }

    public DeployEnvironmentProductRequest setPackageUID(String packageUID) {
        this.packageUID = packageUID;
        return this;
    }
    public String getPackageUID() {
        return this.packageUID;
    }

}
