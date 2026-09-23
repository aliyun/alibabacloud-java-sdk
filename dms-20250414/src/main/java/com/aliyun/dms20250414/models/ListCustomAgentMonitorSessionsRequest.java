// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListCustomAgentMonitorSessionsRequest extends TeaModel {
    /**
     * <p>The custom agent ID.</p>
     * <ul>
     * <li>Required only when QueryType is set to CustomAgent.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ca-4y3ca4khkcu**********ysf</p>
     */
    @NameInMap("CustomAgentId")
    public String customAgentId;

    /**
     * <p>The end time for statistics (epoch millis).</p>
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
     * <p>The page number, starting from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 200. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query scope. Default value: All. Valid values:</p>
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
     * <p>The start time for statistics (epoch millis).</p>
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
     * <p>56kv1pvl9uvt9**********bb</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListCustomAgentMonitorSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentMonitorSessionsRequest self = new ListCustomAgentMonitorSessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentMonitorSessionsRequest setCustomAgentId(String customAgentId) {
        this.customAgentId = customAgentId;
        return this;
    }
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    public ListCustomAgentMonitorSessionsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListCustomAgentMonitorSessionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomAgentMonitorSessionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomAgentMonitorSessionsRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ListCustomAgentMonitorSessionsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListCustomAgentMonitorSessionsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
