// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The ID of the baseline with which the node is associated.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The description of the node.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The operation that you want to perform. Set the value to **ListNodes**.</p>
     */
    @NameInMap("ProgramType")
    public String programType;

    /**
     * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The ID of the owner.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("SchedulerType")
    public String schedulerType;

    public static ListNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesRequest self = new ListNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ListNodesRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public ListNodesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListNodesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesRequest setProgramType(String programType) {
        this.programType = programType;
        return this;
    }
    public String getProgramType() {
        return this.programType;
    }

    public ListNodesRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListNodesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListNodesRequest setSchedulerType(String schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }
    public String getSchedulerType() {
        return this.schedulerType;
    }

}
