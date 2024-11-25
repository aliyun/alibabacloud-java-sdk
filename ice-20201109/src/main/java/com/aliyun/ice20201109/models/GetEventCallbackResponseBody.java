// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEventCallbackResponseBody extends TeaModel {
    /**
     * <p>The authentication key. This parameter is returned only for HTTP callbacks.</p>
     * 
     * <strong>example:</strong>
     * <p>TestKey001</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>Specifies whether callback authentication is enabled. This parameter is returned only for <strong>HTTP</strong> callbacks. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AuthSwitch")
    public String authSwitch;

    /**
     * <p>The name of the Simple Message Queue (SMQ) queue to which callback messages are sent.</p>
     * 
     * <strong>example:</strong>
     * <p>ice-callback-queue</p>
     */
    @NameInMap("CallbackQueueName")
    public String callbackQueueName;

    /**
     * <p>The callback method. Valid values:</p>
     * <ul>
     * <li><strong>HTTP</strong></li>
     * <li><strong>MNS</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("CallbackType")
    public String callbackType;

    /**
     * <p>The callback URL to which event notifications are sent.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxx.yyy/callback">http://xxx.yyy/callback</a></p>
     */
    @NameInMap("CallbackURL")
    public String callbackURL;

    /**
     * <p>The type of the callback event. Multiple values are separated with commas (,). For more information about callback event types, see <a href="https://help.aliyun.com/document_detail/441362.html">Event notification content</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ProduceMediaComplete,TranscodeComplete</p>
     */
    @NameInMap("EventTypeList")
    public String eventTypeList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEventCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventCallbackResponseBody self = new GetEventCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventCallbackResponseBody setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public GetEventCallbackResponseBody setAuthSwitch(String authSwitch) {
        this.authSwitch = authSwitch;
        return this;
    }
    public String getAuthSwitch() {
        return this.authSwitch;
    }

    public GetEventCallbackResponseBody setCallbackQueueName(String callbackQueueName) {
        this.callbackQueueName = callbackQueueName;
        return this;
    }
    public String getCallbackQueueName() {
        return this.callbackQueueName;
    }

    public GetEventCallbackResponseBody setCallbackType(String callbackType) {
        this.callbackType = callbackType;
        return this;
    }
    public String getCallbackType() {
        return this.callbackType;
    }

    public GetEventCallbackResponseBody setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
        return this;
    }
    public String getCallbackURL() {
        return this.callbackURL;
    }

    public GetEventCallbackResponseBody setEventTypeList(String eventTypeList) {
        this.eventTypeList = eventTypeList;
        return this;
    }
    public String getEventTypeList() {
        return this.eventTypeList;
    }

    public GetEventCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
