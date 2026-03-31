// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DescribeDiscoveredResourceBatchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shanghai,cn-hongkong,cn-zhangjiakou,cn-hangzhou</p>
     */
    @NameInMap("Regions")
    public String regions;

    /**
     * <strong>example:</strong>
     * <p>r-wz998f311e21exxx,r-wz97f4a734789xxx</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <strong>example:</strong>
     * <p>ACS::ECS::Disk</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    public static DescribeDiscoveredResourceBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiscoveredResourceBatchRequest self = new DescribeDiscoveredResourceBatchRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiscoveredResourceBatchRequest setRegions(String regions) {
        this.regions = regions;
        return this;
    }
    public String getRegions() {
        return this.regions;
    }

    public DescribeDiscoveredResourceBatchRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public DescribeDiscoveredResourceBatchRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

}
