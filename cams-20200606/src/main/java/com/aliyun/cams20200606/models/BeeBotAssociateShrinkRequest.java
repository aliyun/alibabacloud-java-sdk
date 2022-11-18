// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotAssociateShrinkRequest extends TeaModel {
    @NameInMap("ChatBotInstanceId")
    public String chatBotInstanceId;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("IsvCode")
    public String isvCode;

    @NameInMap("Perspective")
    public String perspectiveShrink;

    @NameInMap("RecommendNum")
    public Integer recommendNum;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Utterance")
    public String utterance;

    public static BeeBotAssociateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BeeBotAssociateShrinkRequest self = new BeeBotAssociateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BeeBotAssociateShrinkRequest setChatBotInstanceId(String chatBotInstanceId) {
        this.chatBotInstanceId = chatBotInstanceId;
        return this;
    }
    public String getChatBotInstanceId() {
        return this.chatBotInstanceId;
    }

    public BeeBotAssociateShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public BeeBotAssociateShrinkRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public BeeBotAssociateShrinkRequest setPerspectiveShrink(String perspectiveShrink) {
        this.perspectiveShrink = perspectiveShrink;
        return this;
    }
    public String getPerspectiveShrink() {
        return this.perspectiveShrink;
    }

    public BeeBotAssociateShrinkRequest setRecommendNum(Integer recommendNum) {
        this.recommendNum = recommendNum;
        return this;
    }
    public Integer getRecommendNum() {
        return this.recommendNum;
    }

    public BeeBotAssociateShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public BeeBotAssociateShrinkRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

}
