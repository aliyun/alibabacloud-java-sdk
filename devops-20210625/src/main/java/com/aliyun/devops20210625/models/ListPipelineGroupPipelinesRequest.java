// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineGroupPipelinesRequest extends TeaModel {
    @NameInMap("createEndTime")
    public Long createEndTime;

    @NameInMap("createStartTime")
    public Long createStartTime;

    @NameInMap("executeEndTime")
    public Long executeEndTime;

    @NameInMap("executeStartTime")
    public Long executeStartTime;

    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("pipelineName")
    public String pipelineName;

    @NameInMap("resultStatusList")
    public String resultStatusList;

    public static ListPipelineGroupPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineGroupPipelinesRequest self = new ListPipelineGroupPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineGroupPipelinesRequest setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public Long getCreateEndTime() {
        return this.createEndTime;
    }

    public ListPipelineGroupPipelinesRequest setCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public Long getCreateStartTime() {
        return this.createStartTime;
    }

    public ListPipelineGroupPipelinesRequest setExecuteEndTime(Long executeEndTime) {
        this.executeEndTime = executeEndTime;
        return this;
    }
    public Long getExecuteEndTime() {
        return this.executeEndTime;
    }

    public ListPipelineGroupPipelinesRequest setExecuteStartTime(Long executeStartTime) {
        this.executeStartTime = executeStartTime;
        return this;
    }
    public Long getExecuteStartTime() {
        return this.executeStartTime;
    }

    public ListPipelineGroupPipelinesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListPipelineGroupPipelinesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPipelineGroupPipelinesRequest setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public ListPipelineGroupPipelinesRequest setResultStatusList(String resultStatusList) {
        this.resultStatusList = resultStatusList;
        return this;
    }
    public String getResultStatusList() {
        return this.resultStatusList;
    }

}
