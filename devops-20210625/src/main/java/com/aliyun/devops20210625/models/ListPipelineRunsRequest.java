// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineRunsRequest extends TeaModel {
    // 结束时间
    @NameInMap("endTime")
    public Long endTime;

    // 最大返回数量
    @NameInMap("maxResults")
    public Long maxResults;

    // 分页Token
    @NameInMap("nextToken")
    public String nextToken;

    // 开始时间
    @NameInMap("startTime")
    public Long startTime;

    // 状态 状态 FAIL 运行失败 SUCCESS 运行成功 RUNNING 运行中
    @NameInMap("status")
    public String status;

    // 触发模式 1人工触发 2定时触发 3代码提交触发
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
