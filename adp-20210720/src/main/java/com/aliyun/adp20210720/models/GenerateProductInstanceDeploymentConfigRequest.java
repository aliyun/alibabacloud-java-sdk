// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GenerateProductInstanceDeploymentConfigRequest extends TeaModel {
    @NameInMap("environmentUID")
    public String environmentUID;

    @NameInMap("packageContentType")
    public String packageContentType;

    @NameInMap("packageUID")
    public String packageUID;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    @NameInMap("productVersionUIDList")
    public java.util.List<String> productVersionUIDList;

    public static GenerateProductInstanceDeploymentConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateProductInstanceDeploymentConfigRequest self = new GenerateProductInstanceDeploymentConfigRequest();
        return TeaModel.build(map, self);
    }

    public GenerateProductInstanceDeploymentConfigRequest setEnvironmentUID(String environmentUID) {
        this.environmentUID = environmentUID;
        return this;
    }
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    public GenerateProductInstanceDeploymentConfigRequest setPackageContentType(String packageContentType) {
        this.packageContentType = packageContentType;
        return this;
    }
    public String getPackageContentType() {
        return this.packageContentType;
    }

    public GenerateProductInstanceDeploymentConfigRequest setPackageUID(String packageUID) {
        this.packageUID = packageUID;
        return this;
    }
    public String getPackageUID() {
        return this.packageUID;
    }

    public GenerateProductInstanceDeploymentConfigRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public GenerateProductInstanceDeploymentConfigRequest setProductVersionUIDList(java.util.List<String> productVersionUIDList) {
        this.productVersionUIDList = productVersionUIDList;
        return this;
    }
    public java.util.List<String> getProductVersionUIDList() {
        return this.productVersionUIDList;
    }

}
