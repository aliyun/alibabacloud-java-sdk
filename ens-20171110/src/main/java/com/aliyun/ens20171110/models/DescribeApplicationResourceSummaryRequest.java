// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeApplicationResourceSummaryRequest extends TeaModel {
    /**
     * <p>The region level. The value must be of the enumerated data type. Valid values:</p>
     * <br>
     * <p>*   **National** (default): Chinese mainland</p>
     * <p>*   **Big**: area</p>
     * <p>*   **Middle**: province</p>
     * <p>*   **Small**: city</p>
     * <p>*   **RegionId**: edge node</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The resource type.</p>
     * <br>
     * <p>Valid value:</p>
     * <br>
     * <p>*   Ens</p>
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
