// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateResourceInventoryRequest extends TeaModel {
    @NameInMap("Regions")
    public String regions;

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

    public GenerateResourceInventoryRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

}
