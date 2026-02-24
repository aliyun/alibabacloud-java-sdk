// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateResourceInventoryRequest extends TeaModel {
    /**
     * <p>The regions where the resources are located. Separate multiple regions with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Regions")
    public String regions;

    /**
     * <p>The resource status. Valid values:</p>
     * <ul>
     * <li><p>1 (default): The resource is retained.</p>
     * </li>
     * <li><p>0: The resource is deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceDeleted")
    public Integer resourceDeleted;

    /**
     * <p>The resource types. Separate multiple resource types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    public static GenerateResourceInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateResourceInventoryRequest self = new GenerateResourceInventoryRequest();
        return TeaModel.build(map, self);
    }

    public GenerateResourceInventoryRequest setRegions(String regions) {
        this.regions = regions;
        return this;
    }
    public String getRegions() {
        return this.regions;
    }

    public GenerateResourceInventoryRequest setResourceDeleted(Integer resourceDeleted) {
        this.resourceDeleted = resourceDeleted;
        return this;
    }
    public Integer getResourceDeleted() {
        return this.resourceDeleted;
    }

    public GenerateResourceInventoryRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

}
