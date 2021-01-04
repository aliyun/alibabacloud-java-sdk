// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadSdkFileRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("SdkVersion")
    public String sdkVersion;

    @NameInMap("Platform")
    public String platform;

    public static DownloadSdkFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadSdkFileRequest self = new DownloadSdkFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadSdkFileRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DownloadSdkFileRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DownloadSdkFileRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DownloadSdkFileRequest setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public DownloadSdkFileRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
