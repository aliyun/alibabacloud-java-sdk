// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitDeploymentRequest extends TeaModel {
    @NameInMap("CloudGameInstanceIds")
    @Validation(required = true)
    public String cloudGameInstanceIds;

    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("OperationType")
    @Validation(required = true)
    public String operationType;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    @NameInMap("VersionId")
    @Validation(required = true)
    public String versionId;

    public static SubmitDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDeploymentRequest self = new SubmitDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDeploymentRequest setCloudGameInstanceIds(String cloudGameInstanceIds) {
        this.cloudGameInstanceIds = cloudGameInstanceIds;
        return this;
    }
    public String getCloudGameInstanceIds() {
        return this.cloudGameInstanceIds;
    }

    public SubmitDeploymentRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public SubmitDeploymentRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public SubmitDeploymentRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitDeploymentRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
