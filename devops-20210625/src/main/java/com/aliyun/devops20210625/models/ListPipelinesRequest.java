// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelinesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1586863220000</p>
     */
    @NameInMap("createEndTime")
    public Long createEndTime;

    /**
     * <strong>example:</strong>
     * <p>1586863220000</p>
     */
    @NameInMap("createStartTime")
    public Long createStartTime;

    /**
     * <strong>example:</strong>
     * <p>112122121</p>
     */
    @NameInMap("creatorAccountIds")
    public String creatorAccountIds;

    /**
     * <strong>example:</strong>
     * <p>1111111</p>
     */
    @NameInMap("executeAccountIds")
    public String executeAccountIds;

    /**
     * <strong>example:</strong>
     * <p>1586863220000</p>
     */
    @NameInMap("executeEndTime")
    public Long executeEndTime;

    /**
     * <strong>example:</strong>
     * <p>1586863220000</p>
     */
    @NameInMap("executeStartTime")
    public Long executeStartTime;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>aaaaaaaaaa</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>流水线</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    /**
     * <strong>example:</strong>
     * <p>RUNNING,SUCCESS</p>
     */
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
