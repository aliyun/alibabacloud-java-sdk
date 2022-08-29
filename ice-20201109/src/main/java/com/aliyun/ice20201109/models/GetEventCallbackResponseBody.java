// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEventCallbackResponseBody extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSwitch")
    public String authSwitch;

    @NameInMap("CallbackQueueName")
    public String callbackQueueName;

    @NameInMap("CallbackType")
    public String callbackType;

    @NameInMap("CallbackURL")
    public String callbackURL;

    @NameInMap("EventTypeList")
    public String eventTypeList;

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
