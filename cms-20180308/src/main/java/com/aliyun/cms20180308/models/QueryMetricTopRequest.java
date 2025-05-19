// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricTopRequest extends TeaModel {
    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Express")
    public String express;

    @NameInMap("Length")
    public String length;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Metric")
    public String metric;

    @NameInMap("OrderDesc")
    public String orderDesc;

    @NameInMap("Orderby")
    public String orderby;

    @NameInMap("Period")
    public String period;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Project")
    public String project;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("StartTime")
    public String startTime;

    public static QueryMetricTopRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricTopRequest self = new QueryMetricTopRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricTopRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public QueryMetricTopRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryMetricTopRequest setExpress(String express) {
        this.express = express;
        return this;
    }
    public String getExpress() {
        return this.express;
    }

    public QueryMetricTopRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public QueryMetricTopRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public QueryMetricTopRequest setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
        return this;
    }
    public String getOrderDesc() {
        return this.orderDesc;
    }

    public QueryMetricTopRequest setOrderby(String orderby) {
        this.orderby = orderby;
        return this;
    }
    public String getOrderby() {
        return this.orderby;
    }

    public QueryMetricTopRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryMetricTopRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public QueryMetricTopRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryMetricTopRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryMetricTopRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
