// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateRPSDKRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("AppUrl")
    @Validation(required = true)
    public String appUrl;

    @NameInMap("Platform")
    public String platform;

    public static CreateRPSDKRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRPSDKRequest self = new CreateRPSDKRequest();
        return TeaModel.build(map, self);
    }

    public CreateRPSDKRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateRPSDKRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateRPSDKRequest setAppUrl(String appUrl) {
        this.appUrl = appUrl;
        return this;
    }
    public String getAppUrl() {
        return this.appUrl;
    }

    public CreateRPSDKRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
