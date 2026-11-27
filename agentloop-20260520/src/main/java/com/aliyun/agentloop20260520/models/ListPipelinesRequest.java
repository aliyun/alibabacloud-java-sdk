// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListPipelinesRequest extends TeaModel {
    /**
     * <p>The maximum number of pipelines to return in the current request. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Pass the nextToken value from the previous response to retrieve the next page. Do not specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg5MA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The type of the pipeline. Valid values:</p>
     * <ul>
     * <li>PROCESSING: Data processing.</li>
     * <li>ORCHESTRATION: Orchestration task.
     * Default value: PROCESSING.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ORCHESTRATION</p>
     */
    @NameInMap("pipelineKind")
    public String pipelineKind;

    /**
     * <p>The name of the pipeline for exact match filtering. If you do not specify this parameter, no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>my-pipeline</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    /**
     * <p>The schedule status of the pipeline. Valid values:</p>
     * <ul>
     * <li>None: No schedule.</li>
     * <li>Active: Active.</li>
     * <li>Paused: Paused.</li>
     * <li>Terminated: Terminated.
     * If you do not specify this parameter, no filtering is applied.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("scheduleStatus")
    public String scheduleStatus;

    /**
     * <p>The schedule type of the pipeline. Valid values:</p>
     * <ul>
     * <li>RunOnce: Single execution.</li>
     * <li>Scheduled: Periodic scheduling.</li>
     * <li>Continuous: Continuous execution driven by trace source signals.
     * If you do not specify this parameter, no filtering is applied.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RunOnce</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    /**
     * <p>The name of the output dataset for exact match filtering. This matches standard sinks, conditional branch sinks, and default sinks. If you do not specify this parameter, no filtering is applied.</p>
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

    public ListPipelinesRequest setPipelineKind(String pipelineKind) {
        this.pipelineKind = pipelineKind;
        return this;
    }
    public String getPipelineKind() {
        return this.pipelineKind;
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
