// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20220210.models;

import com.aliyun.tea.*;

public class GetMqttTicketRequest extends TeaModel {
    @NameInMap("ClientOS")
    public String clientOS;

    @NameInMap("ClientType")
    public Integer clientType;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Uuid")
    public String uuid;

    public static GetMqttTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMqttTicketRequest self = new GetMqttTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetMqttTicketRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public GetMqttTicketRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public GetMqttTicketRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public GetMqttTicketRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public GetMqttTicketRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetMqttTicketRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
