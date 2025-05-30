// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class GenerateUserSessionTokenRequest extends TeaModel {
    /**
     * <p>AI Assistant ID</p>
     * 
     * <strong>example:</strong>
     * <p>cb-069d508f9ab341b1****</p>
     */
    @NameInMap("ChatbotId")
    public String chatbotId;

    /**
     * <p>Expiration Time, in seconds, default 24 hours</p>
     * 
     * <strong>example:</strong>
     * <p>6000</p>
     */
    @NameInMap("ExpireSecond")
    public Long expireSecond;

    /**
     * <p>Integration ID</p>
     * 
     * <strong>example:</strong>
     * <p>cit-960f499au184m7****</p>
     */
    @NameInMap("IntegrateId")
    public String integrateId;

    /**
     * <p>User Avatar (URL)</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxx.com/xxx">https://xxxx.com/xxx</a></p>
     */
    @NameInMap("UserAvatar")
    public String userAvatar;

    /**
     * <p>User ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>929293312213****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>User Nickname</p>
     * 
     * <strong>example:</strong>
     * <p>testxxx</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static GenerateUserSessionTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUserSessionTokenRequest self = new GenerateUserSessionTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUserSessionTokenRequest setChatbotId(String chatbotId) {
        this.chatbotId = chatbotId;
        return this;
    }
    public String getChatbotId() {
        return this.chatbotId;
    }

    public GenerateUserSessionTokenRequest setExpireSecond(Long expireSecond) {
        this.expireSecond = expireSecond;
        return this;
    }
    public Long getExpireSecond() {
        return this.expireSecond;
    }

    public GenerateUserSessionTokenRequest setIntegrateId(String integrateId) {
        this.integrateId = integrateId;
        return this;
    }
    public String getIntegrateId() {
        return this.integrateId;
    }

    public GenerateUserSessionTokenRequest setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
        return this;
    }
    public String getUserAvatar() {
        return this.userAvatar;
    }

    public GenerateUserSessionTokenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GenerateUserSessionTokenRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
