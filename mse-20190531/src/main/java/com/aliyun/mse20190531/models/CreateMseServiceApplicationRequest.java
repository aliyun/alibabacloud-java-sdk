// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateMseServiceApplicationRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    @NameInMap("Language")
    public String language;

    @NameInMap("MseSessionId")
    public String mseSessionId;

    @NameInMap("MseVersion")
    public String mseVersion;

    @NameInMap("Region")
    public String region;

    @NameInMap("SentinelEnable")
    public String sentinelEnable;

    @NameInMap("Source")
    public String source;

    @NameInMap("SwitchEnable")
    public String switchEnable;

    public static CreateMseServiceApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMseServiceApplicationRequest self = new CreateMseServiceApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateMseServiceApplicationRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateMseServiceApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateMseServiceApplicationRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateMseServiceApplicationRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateMseServiceApplicationRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    public CreateMseServiceApplicationRequest setMseVersion(String mseVersion) {
        this.mseVersion = mseVersion;
        return this;
    }
    public String getMseVersion() {
        return this.mseVersion;
    }

    public CreateMseServiceApplicationRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateMseServiceApplicationRequest setSentinelEnable(String sentinelEnable) {
        this.sentinelEnable = sentinelEnable;
        return this;
    }
    public String getSentinelEnable() {
        return this.sentinelEnable;
    }

    public CreateMseServiceApplicationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateMseServiceApplicationRequest setSwitchEnable(String switchEnable) {
        this.switchEnable = switchEnable;
        return this;
    }
    public String getSwitchEnable() {
        return this.switchEnable;
    }

}
