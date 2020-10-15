// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeApplicationResourceSummaryRequest extends TeaModel {
    @NameInMap("Level")
    public String level;

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
