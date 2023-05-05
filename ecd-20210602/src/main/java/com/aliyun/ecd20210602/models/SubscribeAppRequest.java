// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class SubscribeAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Integer appId;

    @NameInMap("AutoDeleteFlag")
    public Boolean autoDeleteFlag;

    @NameInMap("AutoInstallFlag")
    public Boolean autoInstallFlag;

    @NameInMap("DistributeType")
    public String distributeType;

    @NameInMap("ForceInstallType")
    public String forceInstallType;

    @NameInMap("Language")
    public String language;

    @NameInMap("RequestType")
    public String requestType;

    @NameInMap("SilenceDeleteParam")
    public String silenceDeleteParam;

    @NameInMap("SilenceInstallParam")
    public String silenceInstallParam;

    public static SubscribeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeAppRequest self = new SubscribeAppRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeAppRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public SubscribeAppRequest setAutoDeleteFlag(Boolean autoDeleteFlag) {
        this.autoDeleteFlag = autoDeleteFlag;
        return this;
    }
    public Boolean getAutoDeleteFlag() {
        return this.autoDeleteFlag;
    }

    public SubscribeAppRequest setAutoInstallFlag(Boolean autoInstallFlag) {
        this.autoInstallFlag = autoInstallFlag;
        return this;
    }
    public Boolean getAutoInstallFlag() {
        return this.autoInstallFlag;
    }

    public SubscribeAppRequest setDistributeType(String distributeType) {
        this.distributeType = distributeType;
        return this;
    }
    public String getDistributeType() {
        return this.distributeType;
    }

    public SubscribeAppRequest setForceInstallType(String forceInstallType) {
        this.forceInstallType = forceInstallType;
        return this;
    }
    public String getForceInstallType() {
        return this.forceInstallType;
    }

    public SubscribeAppRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SubscribeAppRequest setRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }
    public String getRequestType() {
        return this.requestType;
    }

    public SubscribeAppRequest setSilenceDeleteParam(String silenceDeleteParam) {
        this.silenceDeleteParam = silenceDeleteParam;
        return this;
    }
    public String getSilenceDeleteParam() {
        return this.silenceDeleteParam;
    }

    public SubscribeAppRequest setSilenceInstallParam(String silenceInstallParam) {
        this.silenceInstallParam = silenceInstallParam;
        return this;
    }
    public String getSilenceInstallParam() {
        return this.silenceInstallParam;
    }

}
