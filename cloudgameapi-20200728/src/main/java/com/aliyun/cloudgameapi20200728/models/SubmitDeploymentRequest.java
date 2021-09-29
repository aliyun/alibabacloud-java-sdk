// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitDeploymentRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    // 游戏iD
    @NameInMap("GameId")
    public String gameId;

    // 游戏版本ID
    @NameInMap("VersionId")
    public String versionId;

    // 实例ID列表
    @NameInMap("CloudGameInstanceIds")
    public String cloudGameInstanceIds;

    // 操作类型
    @NameInMap("OperationType")
    public String operationType;

    public static SubmitDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDeploymentRequest self = new SubmitDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDeploymentRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitDeploymentRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public SubmitDeploymentRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public SubmitDeploymentRequest setCloudGameInstanceIds(String cloudGameInstanceIds) {
        this.cloudGameInstanceIds = cloudGameInstanceIds;
        return this;
    }
    public String getCloudGameInstanceIds() {
        return this.cloudGameInstanceIds;
    }

    public SubmitDeploymentRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

}
