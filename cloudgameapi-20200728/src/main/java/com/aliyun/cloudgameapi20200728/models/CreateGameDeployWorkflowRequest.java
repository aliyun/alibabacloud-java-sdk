// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateGameDeployWorkflowRequest extends TeaModel {
    @NameInMap("DownloadType")
    public String downloadType;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("FrameRate")
    public String frameRate;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("GameVersion")
    public String gameVersion;

    @NameInMap("Hash")
    public String hash;

    @NameInMap("Instance")
    public String instance;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("VersionName")
    public String versionName;

    public static CreateGameDeployWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGameDeployWorkflowRequest self = new CreateGameDeployWorkflowRequest();
        return TeaModel.build(map, self);
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

    public CreateGameDeployWorkflowRequest setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

    public CreateGameDeployWorkflowRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public CreateGameDeployWorkflowRequest setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
        return this;
    }
    public String getGameVersion() {
        return this.gameVersion;
    }

    public CreateGameDeployWorkflowRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public CreateGameDeployWorkflowRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public CreateGameDeployWorkflowRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateGameDeployWorkflowRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public CreateGameDeployWorkflowRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
