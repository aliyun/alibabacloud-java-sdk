// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlSummariesRequest extends TeaModel {
    /**
     * <p>Sort in ascending order. Default is <strong>false</strong>.</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * <li><p><strong>false</strong>: No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>End time of the query, in Unix timestamp format, in milliseconds.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. You can query data for any seven-day period within the last 30 days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1679297005999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Database instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf61swc4cru0b****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Keywords in the SQL text. Separate multiple keywords with spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>select update</p>
     */
    @NameInMap("Keywords")
    public String keywords;

    /**
     * <p>Node ID.</p>
     * <blockquote>
     * <p>Provide a node ID for RDS MySQL Cluster Edition or PolarDB for MySQL database instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>Field to sort by. Default is <strong>count</strong>.</p>
     * <ul>
     * <li><p><strong>count</strong>: Number of executions.</p>
     * </li>
     * <li><p><strong>avgLatency</strong>: Average execution time.</p>
     * </li>
     * <li><p><strong>rowsExamined</strong>: Total number of scanned rows.</p>
     * </li>
     * <li><p><strong>rowsExaminedAvg</strong>: Average number of scanned rows.</p>
     * </li>
     * <li><p><strong>rowsSentAvg</strong>: Average number of returned rows.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>count</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>Page number for paged queries. Start from 1. Default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Maximum number of records per page for paged queries. Default is 10. Maximum is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>SQL ID.</p>
     * <blockquote>
     * <p>If you specify an SQL ID, the system returns statistics for that SQL ID only. If you leave this parameter empty, the system returns statistics for the entire database instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>651b56fe9418d48edb8fdf0980ec****</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>Start time of the query, in Unix timestamp format, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1675833788056</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetPfsSqlSummariesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPfsSqlSummariesRequest self = new GetPfsSqlSummariesRequest();
        return TeaModel.build(map, self);
    }

    public GetPfsSqlSummariesRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public GetPfsSqlSummariesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetPfsSqlSummariesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetPfsSqlSummariesRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public GetPfsSqlSummariesRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetPfsSqlSummariesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetPfsSqlSummariesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetPfsSqlSummariesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPfsSqlSummariesRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public GetPfsSqlSummariesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
