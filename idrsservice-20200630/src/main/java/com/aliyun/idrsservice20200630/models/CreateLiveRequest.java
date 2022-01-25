// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateLiveRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Name")
    public String name;

    @NameInMap("RtcCode")
    public String rtcCode;

    @NameInMap("UserId")
    public String userId;

    public static CreateLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRequest self = new CreateLiveRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLiveRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLiveRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLiveRequest setRtcCode(String rtcCode) {
        this.rtcCode = rtcCode;
        return this;
    }
    public String getRtcCode() {
        return this.rtcCode;
    }

    public CreateLiveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
