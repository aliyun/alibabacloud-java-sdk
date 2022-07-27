// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelinesRequest extends TeaModel {
    @NameInMap("createEndTime")
    public Long createEndTime;

    @NameInMap("createStartTime")
    public Long createStartTime;

    @NameInMap("creatorAccountIds")
    public String creatorAccountIds;

    @NameInMap("executeAccountIds")
    public String executeAccountIds;

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

    @NameInMap("statusList")
    public String statusList;

    public static ListPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesRequest self = new ListPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelinesRequest setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public Long getCreateEndTime() {
        return this.createEndTime;
    }

    public ListPipelinesRequest setCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public Long getCreateStartTime() {
        return this.createStartTime;
    }

    public ListPipelinesRequest setCreatorAccountIds(String creatorAccountIds) {
        this.creatorAccountIds = creatorAccountIds;
        return this;
    }
    public String getCreatorAccountIds() {
        return this.creatorAccountIds;
    }

    public ListPipelinesRequest setExecuteAccountIds(String executeAccountIds) {
        this.executeAccountIds = executeAccountIds;
        return this;
    }
    public String getExecuteAccountIds() {
        return this.executeAccountIds;
    }

    public ListPipelinesRequest setExecuteEndTime(Long executeEndTime) {
        this.executeEndTime = executeEndTime;
        return this;
    }
    public Long getExecuteEndTime() {
        return this.executeEndTime;
    }

    public ListPipelinesRequest setExecuteStartTime(Long executeStartTime) {
        this.executeStartTime = executeStartTime;
        return this;
    }
    public Long getExecuteStartTime() {
        return this.executeStartTime;
    }

    public ListPipelinesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
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

    public ListPipelinesRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

}
