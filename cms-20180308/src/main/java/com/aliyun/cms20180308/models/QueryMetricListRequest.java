// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Cursor")
    public String cursor;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;instanceId&quot;: &quot;i-abcdefgh123456&quot;}]</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <strong>example:</strong>
     * <p>2019-01-30 00:10:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>“{&quot;groupby&quot;:[&quot;userId&quot;,&quot;instanceId&quot;]}”</p>
     */
    @NameInMap("Express")
    public String express;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_idle</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Project")
    public String project;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>000</p>
     */
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>2019-01-30 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricListRequest self = new QueryMetricListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricListRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public QueryMetricListRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public QueryMetricListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryMetricListRequest setExpress(String express) {
        this.express = express;
        return this;
    }
    public String getExpress() {
        return this.express;
    }

    public QueryMetricListRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public QueryMetricListRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public QueryMetricListRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryMetricListRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public QueryMetricListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryMetricListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryMetricListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
