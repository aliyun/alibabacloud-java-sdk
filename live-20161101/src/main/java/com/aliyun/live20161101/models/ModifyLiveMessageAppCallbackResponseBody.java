// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageAppCallbackResponseBody extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The signature of the interactive messaging application. It is required by the interactive messaging SDK.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AppSign")
    public String appSign;

    /**
     * <p>Indicates whether authentication is required for event callbacks. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EventCallbackNeedAuthentication")
    public Boolean eventCallbackNeedAuthentication;

    /**
     * <p>The callback URL for events such as user logon, logoff, joining a group, and leaving a group. This parameter is not returned if it has an empty value.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/examplecallback">http://example.aliyundoc.com/examplecallback</a></p>
     */
    @NameInMap("EventCallbackUrl")
    public String eventCallbackUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1F0FFEAD-B7D5-1D4A-A6B9-8C63ADF6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLiveMessageAppCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageAppCallbackResponseBody self = new ModifyLiveMessageAppCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageAppCallbackResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyLiveMessageAppCallbackResponseBody setAppSign(String appSign) {
        this.appSign = appSign;
        return this;
    }
    public String getAppSign() {
        return this.appSign;
    }

    public ModifyLiveMessageAppCallbackResponseBody setEventCallbackNeedAuthentication(Boolean eventCallbackNeedAuthentication) {
        this.eventCallbackNeedAuthentication = eventCallbackNeedAuthentication;
        return this;
    }
    public Boolean getEventCallbackNeedAuthentication() {
        return this.eventCallbackNeedAuthentication;
    }

    public ModifyLiveMessageAppCallbackResponseBody setEventCallbackUrl(String eventCallbackUrl) {
        this.eventCallbackUrl = eventCallbackUrl;
        return this;
    }
    public String getEventCallbackUrl() {
        return this.eventCallbackUrl;
    }

    public ModifyLiveMessageAppCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
