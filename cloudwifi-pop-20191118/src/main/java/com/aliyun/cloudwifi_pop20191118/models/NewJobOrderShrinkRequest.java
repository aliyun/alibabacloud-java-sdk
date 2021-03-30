// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class NewJobOrderShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("ClientSystem")
    public String clientSystem;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("ClientUniqueId")
    public String clientUniqueId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReferUrl")
    public String referUrl;

    @NameInMap("ChangeType")
    public String changeType;

    @NameInMap("Title")
    public String title;

    @NameInMap("Params")
    public String paramsShrink;

    public static NewJobOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        NewJobOrderShrinkRequest self = new NewJobOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public NewJobOrderShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public NewJobOrderShrinkRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public NewJobOrderShrinkRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public NewJobOrderShrinkRequest setClientSystem(String clientSystem) {
        this.clientSystem = clientSystem;
        return this;
    }
    public String getClientSystem() {
        return this.clientSystem;
    }

    public NewJobOrderShrinkRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public NewJobOrderShrinkRequest setClientUniqueId(String clientUniqueId) {
        this.clientUniqueId = clientUniqueId;
        return this;
    }
    public String getClientUniqueId() {
        return this.clientUniqueId;
    }

    public NewJobOrderShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NewJobOrderShrinkRequest setReferUrl(String referUrl) {
        this.referUrl = referUrl;
        return this;
    }
    public String getReferUrl() {
        return this.referUrl;
    }

    public NewJobOrderShrinkRequest setChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }
    public String getChangeType() {
        return this.changeType;
    }

    public NewJobOrderShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public NewJobOrderShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
