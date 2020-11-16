// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetBoardCallbackRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSwitch")
    public String authSwitch;

    @NameInMap("CallbackEnable")
    @Validation(required = true)
    public Integer callbackEnable;

    @NameInMap("CallbackUri")
    public String callbackUri;

    @NameInMap("CallbackEvents")
    public String callbackEvents;

    public static SetBoardCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SetBoardCallbackRequest self = new SetBoardCallbackRequest();
        return TeaModel.build(map, self);
    }

    public SetBoardCallbackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetBoardCallbackRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SetBoardCallbackRequest setAuthSwitch(String authSwitch) {
        this.authSwitch = authSwitch;
        return this;
    }
    public String getAuthSwitch() {
        return this.authSwitch;
    }

    public SetBoardCallbackRequest setCallbackEnable(Integer callbackEnable) {
        this.callbackEnable = callbackEnable;
        return this;
    }
    public Integer getCallbackEnable() {
        return this.callbackEnable;
    }

    public SetBoardCallbackRequest setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
        return this;
    }
    public String getCallbackUri() {
        return this.callbackUri;
    }

    public SetBoardCallbackRequest setCallbackEvents(String callbackEvents) {
        this.callbackEvents = callbackEvents;
        return this;
    }
    public String getCallbackEvents() {
        return this.callbackEvents;
    }

}
