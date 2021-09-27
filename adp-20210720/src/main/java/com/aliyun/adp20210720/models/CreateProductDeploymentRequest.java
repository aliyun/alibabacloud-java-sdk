// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductDeploymentRequest extends TeaModel {
    // 部署包uid
    @NameInMap("packageUID")
    public String packageUID;

    // 环境uid
    @NameInMap("environmentUID")
    public String environmentUID;

    // 产品版本uid
    @NameInMap("productVersionUID")
    public String productVersionUID;

    // 旧产品版本uid
    @NameInMap("oldProductVersionUID")
    public String oldProductVersionUID;

    public static CreateProductDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductDeploymentRequest self = new CreateProductDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductDeploymentRequest setPackageUID(String packageUID) {
        this.packageUID = packageUID;
        return this;
    }
    public String getPackageUID() {
        return this.packageUID;
    }

    public CreateProductDeploymentRequest setEnvironmentUID(String environmentUID) {
        this.environmentUID = environmentUID;
        return this;
    }
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    public CreateProductDeploymentRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public CreateProductDeploymentRequest setOldProductVersionUID(String oldProductVersionUID) {
        this.oldProductVersionUID = oldProductVersionUID;
        return this;
    }
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

}
