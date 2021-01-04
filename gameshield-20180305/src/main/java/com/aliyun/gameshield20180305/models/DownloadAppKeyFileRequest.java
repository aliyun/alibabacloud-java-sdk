// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadAppKeyFileRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("KeyVersion")
    public String keyVersion;

    public static DownloadAppKeyFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadAppKeyFileRequest self = new DownloadAppKeyFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadAppKeyFileRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DownloadAppKeyFileRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DownloadAppKeyFileRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DownloadAppKeyFileRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DownloadAppKeyFileRequest setKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }
    public String getKeyVersion() {
        return this.keyVersion;
    }

}
