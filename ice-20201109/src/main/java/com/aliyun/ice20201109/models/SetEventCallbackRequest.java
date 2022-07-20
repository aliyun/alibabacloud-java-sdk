// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetEventCallbackRequest extends TeaModel {
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

    public static SetEventCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEventCallbackRequest self = new SetEventCallbackRequest();
        return TeaModel.build(map, self);
    }

    public SetEventCallbackRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SetEventCallbackRequest setAuthSwitch(String authSwitch) {
        this.authSwitch = authSwitch;
        return this;
    }
    public String getAuthSwitch() {
        return this.authSwitch;
    }

    public SetEventCallbackRequest setCallbackQueueName(String callbackQueueName) {
        this.callbackQueueName = callbackQueueName;
        return this;
    }
    public String getCallbackQueueName() {
        return this.callbackQueueName;
    }

    public SetEventCallbackRequest setCallbackType(String callbackType) {
        this.callbackType = callbackType;
        return this;
    }
    public String getCallbackType() {
        return this.callbackType;
    }

    public SetEventCallbackRequest setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
        return this;
    }
    public String getCallbackURL() {
        return this.callbackURL;
    }

    public SetEventCallbackRequest setEventTypeList(String eventTypeList) {
        this.eventTypeList = eventTypeList;
        return this;
    }
    public String getEventTypeList() {
        return this.eventTypeList;
    }

}
