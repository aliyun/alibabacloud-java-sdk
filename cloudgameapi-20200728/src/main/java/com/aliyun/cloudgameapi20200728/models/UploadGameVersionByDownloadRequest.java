// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class UploadGameVersionByDownloadRequest extends TeaModel {
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

    public static UploadGameVersionByDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadGameVersionByDownloadRequest self = new UploadGameVersionByDownloadRequest();
        return TeaModel.build(map, self);
    }

    public UploadGameVersionByDownloadRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public UploadGameVersionByDownloadRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
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

    public UploadGameVersionByDownloadRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public UploadGameVersionByDownloadRequest setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
        return this;
    }
    public String getGameVersion() {
        return this.gameVersion;
    }

}
