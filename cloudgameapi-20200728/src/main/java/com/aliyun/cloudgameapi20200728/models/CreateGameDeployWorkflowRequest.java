// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateGameDeployWorkflowRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    @NameInMap("Hash")
    @Validation(required = true)
    public String hash;

    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("DownloadType")
    @Validation(required = true)
    public String downloadType;

    @NameInMap("FileType")
    @Validation(required = true)
    public String fileType;

    @NameInMap("VersionName")
    public String versionName;

    @NameInMap("GameVersion")
    public String gameVersion;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("FrameRate")
    public String frameRate;

    @NameInMap("Instance")
    @Validation(required = true)
    public String instance;

    public static CreateGameDeployWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGameDeployWorkflowRequest self = new CreateGameDeployWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public CreateGameDeployWorkflowRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateGameDeployWorkflowRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public CreateGameDeployWorkflowRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public CreateGameDeployWorkflowRequest setDownloadType(String downloadType) {
        this.downloadType = downloadType;
        return this;
    }
    public String getDownloadType() {
        return this.downloadType;
    }

    public CreateGameDeployWorkflowRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateGameDeployWorkflowRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public CreateGameDeployWorkflowRequest setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
        return this;
    }
    public String getGameVersion() {
        return this.gameVersion;
    }

    public CreateGameDeployWorkflowRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public CreateGameDeployWorkflowRequest setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

    public CreateGameDeployWorkflowRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

}
