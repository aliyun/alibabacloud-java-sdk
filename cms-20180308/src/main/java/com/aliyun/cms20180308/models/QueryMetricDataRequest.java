// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricDataRequest extends TeaModel {
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

    public static QueryMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricDataRequest self = new QueryMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricDataRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public QueryMetricDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryMetricDataRequest setExpress(String express) {
        this.express = express;
        return this;
    }
    public String getExpress() {
        return this.express;
    }

    public QueryMetricDataRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public QueryMetricDataRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public QueryMetricDataRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryMetricDataRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public QueryMetricDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryMetricDataRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryMetricDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
