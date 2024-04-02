// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOpenApiUsageRequest extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartDate")
    public String startDate;

    public static DescribeOpenApiUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenApiUsageRequest self = new DescribeOpenApiUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOpenApiUsageRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeOpenApiUsageRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeOpenApiUsageRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOpenApiUsageRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
