// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotAssociateRequest extends TeaModel {
    @NameInMap("ChatBotInstanceId")
    public String chatBotInstanceId;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("IsvCode")
    public String isvCode;

    @NameInMap("Perspective")
    public java.util.List<String> perspective;

    @NameInMap("RecommendNum")
    public Integer recommendNum;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Utterance")
    public String utterance;

    public static BeeBotAssociateRequest build(java.util.Map<String, ?> map) throws Exception {
        BeeBotAssociateRequest self = new BeeBotAssociateRequest();
        return TeaModel.build(map, self);
    }

    public BeeBotAssociateRequest setChatBotInstanceId(String chatBotInstanceId) {
        this.chatBotInstanceId = chatBotInstanceId;
        return this;
    }
    public String getChatBotInstanceId() {
        return this.chatBotInstanceId;
    }

    public BeeBotAssociateRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public BeeBotAssociateRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public BeeBotAssociateRequest setPerspective(java.util.List<String> perspective) {
        this.perspective = perspective;
        return this;
    }
    public java.util.List<String> getPerspective() {
        return this.perspective;
    }

    public BeeBotAssociateRequest setRecommendNum(Integer recommendNum) {
        this.recommendNum = recommendNum;
        return this;
    }
    public Integer getRecommendNum() {
        return this.recommendNum;
    }

    public BeeBotAssociateRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public BeeBotAssociateRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

}
