// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotAssociateRequest extends TeaModel {
    /**
     * <p>The ID of a bot instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChatBotInstanceId")
    public String chatBotInstanceId;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ISV verification code, which is used to verify whether the user is authorized by ISV.</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The list of codes for answers from different perspectives.</p>
     */
    @NameInMap("Perspective")
    public java.util.List<String> perspective;

    /**
     * <p>The number of recommended questions. The value ranges from 1 to 10.</p>
     */
    @NameInMap("RecommendNum")
    public Integer recommendNum;

    /**
     * <p>The ID of the session, which is used to identify the session and store context information in the session.</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The input of the visitor.</p>
     */
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
