// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListPipelineRunsRequest extends TeaModel {
    /**
     * <p>The upper bound of the trigger time filter (triggered_at &lt;= endTime). The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The maximum number of entries to return in the current request. Default value: 50. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. To retrieve the next page of results, pass the nextToken value from the previous response. Do not specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg5MA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The lower bound of the trigger time filter (triggered_at &gt;= startTime). The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735574400</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>Filters the results by run status. Valid values: Pending, Running, Succeeded, Failed, and Cancelled. If you do not specify this parameter, the results are not filtered by status.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Filters the results by trigger type. Valid values: Manual, Scheduled, and RunOnce. If you do not specify this parameter, the results are not filtered by trigger type.</p>
     * 
     * <strong>example:</strong>
     * <p>Scheduled</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    public static ListPipelineRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunsRequest self = new ListPipelineRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListPipelineRunsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPipelineRunsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPipelineRunsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListPipelineRunsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListPipelineRunsRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
