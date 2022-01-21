// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowProjectRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    // 项目描述
    @NameInMap("Description")
    public String description;

    // 项目名称
    @NameInMap("Name")
    public String name;

    // 产品类型，固定值DATABRICKS_DATAINSIGHT
    @NameInMap("ProductType")
    public String productType;

    // 地域ID
    @NameInMap("RegionId")
    public String regionId;

    // 资源组ID
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateFlowProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowProjectRequest self = new CreateFlowProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowProjectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFlowProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFlowProjectRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateFlowProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFlowProjectRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
