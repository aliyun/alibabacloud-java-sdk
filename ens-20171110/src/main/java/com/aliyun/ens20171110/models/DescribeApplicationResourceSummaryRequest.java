// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeApplicationResourceSummaryRequest extends TeaModel {
    /**
     * <p>The region level. The value must be of the enumerated data type. Valid values:</p>
     * <ul>
     * <li><strong>National</strong> (default): Chinese mainland</li>
     * <li><strong>Big</strong>: area</li>
     * <li><strong>Middle</strong>: province</li>
     * <li><strong>Small</strong>: city</li>
     * <li><strong>RegionId</strong>: edge node</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>National</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The resource type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>Ens</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BareMetal-Arm</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeApplicationResourceSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationResourceSummaryRequest self = new DescribeApplicationResourceSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationResourceSummaryRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeApplicationResourceSummaryRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
