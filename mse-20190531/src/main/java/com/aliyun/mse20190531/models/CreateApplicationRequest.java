// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    @NameInMap("Language")
    public String language;

    @NameInMap("Region")
    public String region;

    @NameInMap("SentinelEnable")
    public String sentinelEnable;

    @NameInMap("Source")
    public String source;

    @NameInMap("SwitchEnable")
    public String switchEnable;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateApplicationRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateApplicationRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateApplicationRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateApplicationRequest setSentinelEnable(String sentinelEnable) {
        this.sentinelEnable = sentinelEnable;
        return this;
    }
    public String getSentinelEnable() {
        return this.sentinelEnable;
    }

    public CreateApplicationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateApplicationRequest setSwitchEnable(String switchEnable) {
        this.switchEnable = switchEnable;
        return this;
    }
    public String getSwitchEnable() {
        return this.switchEnable;
    }

}
