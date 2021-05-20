// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityRelativeNodeRequest extends TeaModel {
    @NameInMap("EnvType")
    public String envType;

    @NameInMap("MatchExpression")
    public String matchExpression;

    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TargetNodeProjectName")
    public String targetNodeProjectName;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("TargetNodeProjectId")
    public Long targetNodeProjectId;

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

    public CreateQualityRelativeNodeRequest setTargetNodeProjectName(String targetNodeProjectName) {
        this.targetNodeProjectName = targetNodeProjectName;
        return this;
    }
    public String getTargetNodeProjectName() {
        return this.targetNodeProjectName;
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

}
