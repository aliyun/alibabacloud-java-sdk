// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GenerateUserAccessTokenRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Email")
    public String email;

    @NameInMap("ExpireTime")
    public Integer expireTime;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    @NameInMap("ForeignId")
    public String foreignId;

    @NameInMap("Nick")
    public String nick;

    @NameInMap("Telephone")
    public String telephone;

    public static GenerateUserAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUserAccessTokenRequest self = new GenerateUserAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUserAccessTokenRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GenerateUserAccessTokenRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GenerateUserAccessTokenRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public GenerateUserAccessTokenRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public GenerateUserAccessTokenRequest setForeignId(String foreignId) {
        this.foreignId = foreignId;
        return this;
    }
    public String getForeignId() {
        return this.foreignId;
    }

    public GenerateUserAccessTokenRequest setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

    public GenerateUserAccessTokenRequest setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

}
