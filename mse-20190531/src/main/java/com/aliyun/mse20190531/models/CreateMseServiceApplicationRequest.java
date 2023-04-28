// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateMseServiceApplicationRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>edasmsc</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <p>The additional information.</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>Creates an application.</p>
     */
    @NameInMap("MseVersion")
    public String mseVersion;

    /**
     * <p>The creation time.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The source type.</p>
     */
    @NameInMap("SentinelEnable")
    public String sentinelEnable;

    /**
     * <p>The last modification time.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the request.</p>
     */
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
