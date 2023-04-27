// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The position of the node on the Directed Acyclic Graph (DAG).</p>
     */
    @NameInMap("GraphParam")
    public String graphParam;

    /**
     * <p>The configuration of the node.</p>
     */
    @NameInMap("NodeContent")
    public String nodeContent;

    /**
     * <p>The name of the node that you want to create.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The output variables configured for the task.</p>
     */
    @NameInMap("NodeOutput")
    public String nodeOutput;

    /**
     * <p>The type of the node that you want to create. For more information about the valid values for this parameter, see [NodeType parameter](~~424705~~).</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The tenant ID.</p>
     * <br>
     * <p>>  To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The time variables configured for the node.</p>
     */
    @NameInMap("TimeVariables")
    public String timeVariables;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public CreateTaskRequest setGraphParam(String graphParam) {
        this.graphParam = graphParam;
        return this;
    }
    public String getGraphParam() {
        return this.graphParam;
    }

    public CreateTaskRequest setNodeContent(String nodeContent) {
        this.nodeContent = nodeContent;
        return this;
    }
    public String getNodeContent() {
        return this.nodeContent;
    }

    public CreateTaskRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public CreateTaskRequest setNodeOutput(String nodeOutput) {
        this.nodeOutput = nodeOutput;
        return this;
    }
    public String getNodeOutput() {
        return this.nodeOutput;
    }

    public CreateTaskRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public CreateTaskRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public CreateTaskRequest setTimeVariables(String timeVariables) {
        this.timeVariables = timeVariables;
        return this;
    }
    public String getTimeVariables() {
        return this.timeVariables;
    }

}
