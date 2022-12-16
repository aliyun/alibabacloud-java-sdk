// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateMseServiceApplicationRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The name of the application.
    @NameInMap("AppName")
    public String appName;

    // The additional information.
    @NameInMap("ExtraInfo")
    public String extraInfo;

    // The programming language of the application.
    @NameInMap("Language")
    public String language;

    // The edition of the MSE instance that you want to purchase.
    // 
    // *   mse_pro: Professional Edition
    // *   mse_dev: Developer Edition
    @NameInMap("MseVersion")
    public String mseVersion;

    // The ID of the region where the Microservices Engine (MSE) instance resides. Examples:
    // 
    // *   cn-hangzhou: China (Hangzhou)
    // *   cn-beijing: China (Beijing)
    // *   cn-shanghai: China (Shanghai)
    // *   cn-zhangjiakou: China (Zhangjiakou)
    // *   cn-shenzhen: China (Shenzhen)
    @NameInMap("Region")
    public String region;

    // Specifies whether to enable the Sentinel-compatible mode.
    @NameInMap("SentinelEnable")
    public String sentinelEnable;

    // The service source.
    @NameInMap("Source")
    public String source;

    // Specifies whether to enable switching.
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
