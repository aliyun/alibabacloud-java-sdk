// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInnerNodesRequest extends TeaModel {
    /**
     * <p>The ID of the node group to which the inner nodes belong.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("OuterNodeId")
    public Long outerNodeId;

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
     * <p>The number of the page to return. Minimum value: 1. Maximum value: 100.</p>
     */
    @NameInMap("ProgramType")
    public String programType;

    /**
     * <p>The name of the node to which the inner nodes belong.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The environment in which the node is run. Valid values: DEV and PROD. Default value: PROD.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListInnerNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInnerNodesRequest self = new ListInnerNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListInnerNodesRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public ListInnerNodesRequest setOuterNodeId(Long outerNodeId) {
        this.outerNodeId = outerNodeId;
        return this;
    }
    public Long getOuterNodeId() {
        return this.outerNodeId;
    }

    public ListInnerNodesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInnerNodesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInnerNodesRequest setProgramType(String programType) {
        this.programType = programType;
        return this;
    }
    public String getProgramType() {
        return this.programType;
    }

    public ListInnerNodesRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListInnerNodesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
