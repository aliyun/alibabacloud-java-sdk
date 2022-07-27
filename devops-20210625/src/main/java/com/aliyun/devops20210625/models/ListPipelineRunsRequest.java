// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineRunsRequest extends TeaModel {
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("status")
    public String status;

    @NameInMap("triggerMode")
    public Integer triggerMode;

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

    public ListPipelineRunsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
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

    public ListPipelineRunsRequest setTriggerMode(Integer triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public Integer getTriggerMode() {
        return this.triggerMode;
    }

}
