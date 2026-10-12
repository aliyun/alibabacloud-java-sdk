// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListBatchExportTasksRequest extends TeaModel {
    /**
     * <p>The end of the creation time range. Format: yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-26T11:00:00Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The gateway instance ID. If specified, only tasks under this gateway are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The maximum number of tasks to return in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The paging token that indicates the start position of the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>token-xxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The start of the creation time range. Format: yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-26T10:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The list of task statuses. Separate multiple statuses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>Pending,Running</p>
     */
    @NameInMap("statuses")
    public String statuses;

    public static ListBatchExportTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBatchExportTasksRequest self = new ListBatchExportTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListBatchExportTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListBatchExportTasksRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListBatchExportTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBatchExportTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBatchExportTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBatchExportTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBatchExportTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListBatchExportTasksRequest setStatuses(String statuses) {
        this.statuses = statuses;
        return this;
    }
    public String getStatuses() {
        return this.statuses;
    }

}
