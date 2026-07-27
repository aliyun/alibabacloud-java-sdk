// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityRelativeNodeRequest extends TeaModel {
    /**
     * <p>The type of the engine or data source. Valid values:</p>
     * <ul>
     * <li><p>cdh</p>
     * </li>
     * <li><p>analyticdb_for_mysql</p>
     * </li>
     * <li><p>odps</p>
     * </li>
     * <li><p>emr</p>
     * </li>
     * <li><p>hadoop</p>
     * </li>
     * <li><p>holodb</p>
     * </li>
     * <li><p>hybriddb_for_postgresql</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ODPS</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The partition filter expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dt=$[yyyymmdd]</p>
     */
    @NameInMap("MatchExpression")
    public String matchExpression;

    /**
     * <p>The node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>156234</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The table name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dual</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the workspace that contains the associated scheduling node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("TargetNodeProjectId")
    public Long targetNodeProjectId;

    /**
     * <p>The name of the workspace that contains the associated scheduling node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest</p>
     */
    @NameInMap("TargetNodeProjectName")
    public String targetNodeProjectName;

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

    public DeleteQualityRelativeNodeRequest setTargetNodeProjectName(String targetNodeProjectName) {
        this.targetNodeProjectName = targetNodeProjectName;
        return this;
    }
    public String getTargetNodeProjectName() {
        return this.targetNodeProjectName;
    }

}
