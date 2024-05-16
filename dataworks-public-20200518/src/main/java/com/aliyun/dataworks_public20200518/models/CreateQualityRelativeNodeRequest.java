// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityRelativeNodeRequest extends TeaModel {
    /**
     * <p>The type of the compute engine instance or data source.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The partition filter expression.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MatchExpression")
    public String matchExpression;

    /**
     * <p>The ID of the node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The ID of the workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine instance or data source.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the table.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the workspace to which the node to be associated with the partition filter expression belongs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetNodeProjectId")
    public Long targetNodeProjectId;

    /**
     * <p>The name of the workspace to which the node to be associated with the partition filter expression belongs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetNodeProjectName")
    public String targetNodeProjectName;

    public static CreateQualityRelativeNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityRelativeNodeRequest self = new CreateQualityRelativeNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateQualityRelativeNodeRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public CreateQualityRelativeNodeRequest setMatchExpression(String matchExpression) {
        this.matchExpression = matchExpression;
        return this;
    }
    public String getMatchExpression() {
        return this.matchExpression;
    }

    public CreateQualityRelativeNodeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public CreateQualityRelativeNodeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateQualityRelativeNodeRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateQualityRelativeNodeRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateQualityRelativeNodeRequest setTargetNodeProjectId(Long targetNodeProjectId) {
        this.targetNodeProjectId = targetNodeProjectId;
        return this;
    }
    public Long getTargetNodeProjectId() {
        return this.targetNodeProjectId;
    }

    public CreateQualityRelativeNodeRequest setTargetNodeProjectName(String targetNodeProjectName) {
        this.targetNodeProjectName = targetNodeProjectName;
        return this;
    }
    public String getTargetNodeProjectName() {
        return this.targetNodeProjectName;
    }

}
