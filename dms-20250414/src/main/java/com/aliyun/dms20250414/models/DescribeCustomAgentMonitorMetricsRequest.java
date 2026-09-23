// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeCustomAgentMonitorMetricsRequest extends TeaModel {
    /**
     * <p>The custom agent ID.</p>
     * <ul>
     * <li>Required only when QueryType is set to CustomAgent.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ca-a9fd******0lnq4g6c</p>
     */
    @NameInMap("CustomAgentId")
    public String customAgentId;

    /**
     * <p>The end time of the statistical period (epoch millis).</p>
     * <ul>
     * <li>Note: The maximum time range is 3 months.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1756742400000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The aggregation granularity. Valid values:</p>
     * <ul>
     * <li>DAY: daily. The maximum supported time range is 3 months.</li>
     * <li>HOUR: hourly. The maximum supported time range is 72 hours.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The statistical scope. Default value: All. Valid values:</p>
     * <ul>
     * <li>Default: default DataAgent sessions.</li>
     * <li>CustomAgent: specified custom agent sessions.</li>
     * <li>All: all sessions in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The start time of the statistical period (epoch millis).</p>
     * <ul>
     * <li>Note: The maximum time range is 3 months.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1756656000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>99fad******qg6c0l4nlacu</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DescribeCustomAgentMonitorMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomAgentMonitorMetricsRequest self = new DescribeCustomAgentMonitorMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomAgentMonitorMetricsRequest setCustomAgentId(String customAgentId) {
        this.customAgentId = customAgentId;
        return this;
    }
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    public DescribeCustomAgentMonitorMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeCustomAgentMonitorMetricsRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public DescribeCustomAgentMonitorMetricsRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public DescribeCustomAgentMonitorMetricsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeCustomAgentMonitorMetricsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
