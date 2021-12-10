// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class UploadGameVersionByDownloadRequest extends TeaModel {
    @NameInMap("DownloadType")
    public String downloadType;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("GameVersion")
    public String gameVersion;

    @NameInMap("Hash")
    public String hash;

    @NameInMap("VersionName")
    public String versionName;

    public static UploadGameVersionByDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadGameVersionByDownloadRequest self = new UploadGameVersionByDownloadRequest();
        return TeaModel.build(map, self);
    }

    public UploadGameVersionByDownloadRequest setDownloadType(String downloadType) {
        this.downloadType = downloadType;
        return this;
    }
    public String getDownloadType() {
        return this.downloadType;
    }

    public UploadGameVersionByDownloadRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public UploadGameVersionByDownloadRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public UploadGameVersionByDownloadRequest setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
        return this;
    }
    public String getGameVersion() {
        return this.gameVersion;
    }

    public UploadGameVersionByDownloadRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public UploadGameVersionByDownloadRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
