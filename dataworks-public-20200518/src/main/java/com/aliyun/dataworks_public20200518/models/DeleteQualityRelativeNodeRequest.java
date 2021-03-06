// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityRelativeNodeRequest extends TeaModel {
    @NameInMap("EnvType")
    @Validation(required = true)
    public String envType;

    @NameInMap("MatchExpression")
    @Validation(required = true)
    public String matchExpression;

    @NameInMap("NodeId")
    @Validation(required = true)
    public Long nodeId;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("TargetNodeProjectName")
    @Validation(required = true)
    public String targetNodeProjectName;

    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    @NameInMap("TableName")
    @Validation(required = true)
    public String tableName;

    @NameInMap("TargetNodeProjectId")
    @Validation(required = true)
    public Long targetNodeProjectId;

    public static DeleteQualityRelativeNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityRelativeNodeRequest self = new DeleteQualityRelativeNodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQualityRelativeNodeRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public DeleteQualityRelativeNodeRequest setMatchExpression(String matchExpression) {
        this.matchExpression = matchExpression;
        return this;
    }
    public String getMatchExpression() {
        return this.matchExpression;
    }

    public DeleteQualityRelativeNodeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public DeleteQualityRelativeNodeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteQualityRelativeNodeRequest setTargetNodeProjectName(String targetNodeProjectName) {
        this.targetNodeProjectName = targetNodeProjectName;
        return this;
    }
    public String getTargetNodeProjectName() {
        return this.targetNodeProjectName;
    }

    public DeleteQualityRelativeNodeRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeleteQualityRelativeNodeRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DeleteQualityRelativeNodeRequest setTargetNodeProjectId(Long targetNodeProjectId) {
        this.targetNodeProjectId = targetNodeProjectId;
        return this;
    }
    public Long getTargetNodeProjectId() {
        return this.targetNodeProjectId;
    }

}
