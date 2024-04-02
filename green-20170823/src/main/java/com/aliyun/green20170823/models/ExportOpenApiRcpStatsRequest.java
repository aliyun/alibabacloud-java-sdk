// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class ExportOpenApiRcpStatsRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("StartDate")
    public String startDate;

    public static ExportOpenApiRcpStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportOpenApiRcpStatsRequest self = new ExportOpenApiRcpStatsRequest();
        return TeaModel.build(map, self);
    }

    public ExportOpenApiRcpStatsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ExportOpenApiRcpStatsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ExportOpenApiRcpStatsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ExportOpenApiRcpStatsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
