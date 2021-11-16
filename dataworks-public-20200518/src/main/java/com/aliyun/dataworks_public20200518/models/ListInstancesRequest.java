// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    @NameInMap("BeginBizdate")
    public String beginBizdate;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("Bizdate")
    public String bizdate;

    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("EndBizdate")
    public String endBizdate;

    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProgramType")
    public String programType;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("ProjectId")
    public Long projectId;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setBeginBizdate(String beginBizdate) {
        this.beginBizdate = beginBizdate;
        return this;
    }
    public String getBeginBizdate() {
        return this.beginBizdate;
    }

    public ListInstancesRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ListInstancesRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
    }

    public ListInstancesRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ListInstancesRequest setEndBizdate(String endBizdate) {
        this.endBizdate = endBizdate;
        return this;
    }
    public String getEndBizdate() {
        return this.endBizdate;
    }

    public ListInstancesRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public ListInstancesRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public ListInstancesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesRequest setProgramType(String programType) {
        this.programType = programType;
        return this;
    }
    public String getProgramType() {
        return this.programType;
    }

    public ListInstancesRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListInstancesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
