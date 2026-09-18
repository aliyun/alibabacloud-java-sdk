// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListPipelinesRequest extends TeaModel {
    /**
     * <p>The maximum number of pipelines to return. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the nextToken value returned in the previous response to retrieve the next page. Do not specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg5MA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Filters pipelines by name using exact match. If this parameter is not specified, no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>my-pipeline</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    /**
     * <p>Filters pipelines by schedule status. If this parameter is not specified, no filtering is applied. Valid values:</p>
     * <ul>
     * <li>None: No schedule.</li>
     * <li>Active: Active.</li>
     * <li>Paused: Paused.</li>
     * <li>Terminated: Terminated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("scheduleStatus")
    public String scheduleStatus;

    /**
     * <p>Filters pipelines by schedule type. If this parameter is not specified, no filtering is applied. Valid values:</p>
     * <ul>
     * <li>RunOnce: One-time execution.</li>
     * <li>Scheduled: Periodic scheduling.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RunOnce</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    /**
     * <p>Filters pipelines by the exact name of the output dataset. Matches standard sinks, conditional branch sinks, and default sinks. If this parameter is not specified, no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>my-dataset</p>
     */
    @NameInMap("sinkName")
    public String sinkName;

    public static ListPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesRequest self = new ListPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelinesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPipelinesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPipelinesRequest setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public ListPipelinesRequest setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }
    public String getScheduleStatus() {
        return this.scheduleStatus;
    }

    public ListPipelinesRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public ListPipelinesRequest setSinkName(String sinkName) {
        this.sinkName = sinkName;
        return this;
    }
    public String getSinkName() {
        return this.sinkName;
    }

}
