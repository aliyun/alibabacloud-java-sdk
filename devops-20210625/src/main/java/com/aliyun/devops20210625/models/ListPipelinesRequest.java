// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelinesRequest extends TeaModel {
    // 流水线名称
    @NameInMap("pipelineName")
    public String pipelineName;

    // 创建人阿里云账号Id
    @NameInMap("creatorAccountIds")
    public String creatorAccountIds;

    // 执行人阿里云账号id
    @NameInMap("executeAccountIds")
    public String executeAccountIds;

    // 状态列表，多个逗号分割
    @NameInMap("statusList")
    public String statusList;

    // 创建开始时间
    @NameInMap("createStartTime")
    public Long createStartTime;

    // 创建结束时间
    @NameInMap("createEndTime")
    public Long createEndTime;

    // 执行开始时间
    @NameInMap("executeStartTime")
    public Long executeStartTime;

    // 执行结束时间
    @NameInMap("executeEndTime")
    public Long executeEndTime;

    // 返回的总数
    @NameInMap("maxResults")
    public Long maxResults;

    // 分页Token
    @NameInMap("nextToken")
    public String nextToken;

    public static ListPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesRequest self = new ListPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelinesRequest setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
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

    public ListPipelinesRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public ListPipelinesRequest setCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public Long getCreateStartTime() {
        return this.createStartTime;
    }

    public ListPipelinesRequest setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public Long getCreateEndTime() {
        return this.createEndTime;
    }

    public ListPipelinesRequest setExecuteStartTime(Long executeStartTime) {
        this.executeStartTime = executeStartTime;
        return this;
    }
    public Long getExecuteStartTime() {
        return this.executeStartTime;
    }

    public ListPipelinesRequest setExecuteEndTime(Long executeEndTime) {
        this.executeEndTime = executeEndTime;
        return this;
    }
    public Long getExecuteEndTime() {
        return this.executeEndTime;
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

}
