// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeDownloadUrlsForAppKeyRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppKeyVersion")
    public String appKeyVersion;

    public static DescribeDownloadUrlsForAppKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadUrlsForAppKeyRequest self = new DescribeDownloadUrlsForAppKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadUrlsForAppKeyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDownloadUrlsForAppKeyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDownloadUrlsForAppKeyRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeDownloadUrlsForAppKeyRequest setAppKeyVersion(String appKeyVersion) {
        this.appKeyVersion = appKeyVersion;
        return this;
    }
    public String getAppKeyVersion() {
        return this.appKeyVersion;
    }

}
