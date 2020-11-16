// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateBoardCallbackRequest extends TeaModel {
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

    public static UpdateBoardCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBoardCallbackRequest self = new UpdateBoardCallbackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBoardCallbackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateBoardCallbackRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public UpdateBoardCallbackRequest setAuthSwitch(String authSwitch) {
        this.authSwitch = authSwitch;
        return this;
    }
    public String getAuthSwitch() {
        return this.authSwitch;
    }

    public UpdateBoardCallbackRequest setCallbackEnable(Integer callbackEnable) {
        this.callbackEnable = callbackEnable;
        return this;
    }
    public Integer getCallbackEnable() {
        return this.callbackEnable;
    }

    public UpdateBoardCallbackRequest setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
        return this;
    }
    public String getCallbackUri() {
        return this.callbackUri;
    }

    public UpdateBoardCallbackRequest setCallbackEvents(String callbackEvents) {
        this.callbackEvents = callbackEvents;
        return this;
    }
    public String getCallbackEvents() {
        return this.callbackEvents;
    }

}
