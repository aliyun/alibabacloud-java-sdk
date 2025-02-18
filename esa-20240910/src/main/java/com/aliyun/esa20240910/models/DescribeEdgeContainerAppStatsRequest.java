// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeEdgeContainerAppStatsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-xxxx</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <strong>example:</strong>
     * <p>2024-09-02T16:04:05Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pod_ready_rate</p>
     */
    @NameInMap("Fields")
    public String fields;

    /**
     * <strong>example:</strong>
     * <p>telecom,unicom,cmcc</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <strong>example:</strong>
     * <p>huizhou</p>
     */
    @NameInMap("Locate")
    public String locate;

    /**
     * <strong>example:</strong>
     * <p>2024-09-02T15:04:05Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>t-xxxx</p>
     */
    @NameInMap("Tenant")
    public String tenant;

    public static DescribeEdgeContainerAppStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeContainerAppStatsRequest self = new DescribeEdgeContainerAppStatsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeContainerAppStatsRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeEdgeContainerAppStatsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEdgeContainerAppStatsRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public DescribeEdgeContainerAppStatsRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeEdgeContainerAppStatsRequest setLocate(String locate) {
        this.locate = locate;
        return this;
    }
    public String getLocate() {
        return this.locate;
    }

    public DescribeEdgeContainerAppStatsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeEdgeContainerAppStatsRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
