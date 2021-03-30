// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class NewJobOrderRequest extends TeaModel {
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
    public java.util.Map<String, ?> params;

    public static NewJobOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        NewJobOrderRequest self = new NewJobOrderRequest();
        return TeaModel.build(map, self);
    }

    public NewJobOrderRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public NewJobOrderRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public NewJobOrderRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public NewJobOrderRequest setClientSystem(String clientSystem) {
        this.clientSystem = clientSystem;
        return this;
    }
    public String getClientSystem() {
        return this.clientSystem;
    }

    public NewJobOrderRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public NewJobOrderRequest setClientUniqueId(String clientUniqueId) {
        this.clientUniqueId = clientUniqueId;
        return this;
    }
    public String getClientUniqueId() {
        return this.clientUniqueId;
    }

    public NewJobOrderRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NewJobOrderRequest setReferUrl(String referUrl) {
        this.referUrl = referUrl;
        return this;
    }
    public String getReferUrl() {
        return this.referUrl;
    }

    public NewJobOrderRequest setChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }
    public String getChangeType() {
        return this.changeType;
    }

    public NewJobOrderRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public NewJobOrderRequest setParams(java.util.Map<String, ?> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

}
