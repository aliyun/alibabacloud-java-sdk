// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInnerNodesRequest extends TeaModel {
    /**
     * <p>The name of the node to which the inner nodes belong.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The ID of the node group to which the inner nodes belong.</p>
     */
    @NameInMap("OuterNodeId")
    public Long outerNodeId;

    /**
     * <p>The number of the page to return. Minimum value: 1. Maximum value: 100.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the node to which the inner nodes belong.</p>
     * <br>
     * <p>Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 97 (PAI), 98 (node group), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1002 (PAI inner node), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), 1106 (for-each), and 1221 (PyODPS 3). You can call the ListNodes operation to query the type of the node.</p>
     */
    @NameInMap("ProgramType")
    public String programType;

    /**
     * <p>The environment in which the node is run. Valid values: DEV and PROD. Default value: PROD.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The ID of the workspace.</p>
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
