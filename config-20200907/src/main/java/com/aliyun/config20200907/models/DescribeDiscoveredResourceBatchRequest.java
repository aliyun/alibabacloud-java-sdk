// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DescribeDiscoveredResourceBatchRequest extends TeaModel {
    /**
     * <p>The regions where the resources reside. Separate multiple regions with commas (<code>,</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai,cn-hongkong,cn-zhangjiakou,cn-hangzhou</p>
     */
    @NameInMap("Regions")
    public String regions;

    /**
     * <p>The resource IDs. Separate multiple resource IDs with commas (<code>,</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>r-wz998f311e21****,r-wz97f4a73478****</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The resource types. Separate multiple resource types with commas (<code>,</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Disk,ACS::ECS::Instance</p>
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
