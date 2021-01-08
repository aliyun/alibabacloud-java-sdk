// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListPipelinesRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PipelineName")
    public String pipelineName;

    @NameInMap("Creators")
    public String creators;

    @NameInMap("Operators")
    public String operators;

    @NameInMap("ResultStatusList")
    public String resultStatusList;

    @NameInMap("CreateStartTime")
    public String createStartTime;

    @NameInMap("CreateEndTime")
    public String createEndTime;

    @NameInMap("ExecuteStartTime")
    public String executeStartTime;

    @NameInMap("ExecuteEndTime")
    public String executeEndTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageStart")
    public Integer pageStart;

    @NameInMap("UserPk")
    public String userPk;

    public static ListPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesRequest self = new ListPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelinesRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ListPipelinesRequest setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public ListPipelinesRequest setCreators(String creators) {
        this.creators = creators;
        return this;
    }
    public String getCreators() {
        return this.creators;
    }

    public ListPipelinesRequest setOperators(String operators) {
        this.operators = operators;
        return this;
    }
    public String getOperators() {
        return this.operators;
    }

    public ListPipelinesRequest setResultStatusList(String resultStatusList) {
        this.resultStatusList = resultStatusList;
        return this;
    }
    public String getResultStatusList() {
        return this.resultStatusList;
    }

    public ListPipelinesRequest setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    public ListPipelinesRequest setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    public ListPipelinesRequest setExecuteStartTime(String executeStartTime) {
        this.executeStartTime = executeStartTime;
        return this;
    }
    public String getExecuteStartTime() {
        return this.executeStartTime;
    }

    public ListPipelinesRequest setExecuteEndTime(String executeEndTime) {
        this.executeEndTime = executeEndTime;
        return this;
    }
    public String getExecuteEndTime() {
        return this.executeEndTime;
    }

    public ListPipelinesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPipelinesRequest setPageStart(Integer pageStart) {
        this.pageStart = pageStart;
        return this;
    }
    public Integer getPageStart() {
        return this.pageStart;
    }

    public ListPipelinesRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

}
