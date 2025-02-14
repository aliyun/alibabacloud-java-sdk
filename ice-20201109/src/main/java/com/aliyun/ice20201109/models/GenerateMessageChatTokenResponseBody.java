// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GenerateMessageChatTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>H4sIAAAAAAAE******************</p>
     */
    @NameInMap("AppSign")
    public String appSign;

    /**
     * <strong>example:</strong>
     * <p>AK-***********</p>
     */
    @NameInMap("Nonce")
    public String nonce;

    /**
     * <strong>example:</strong>
     * <p>req_1234567890abcdef</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("TimeStamp")
    public Long timeStamp;

    /**
     * <strong>example:</strong>
     * <p>acet**********</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <strong>example:</strong>
     * <p>YOURUSERID</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GenerateMessageChatTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateMessageChatTokenResponseBody self = new GenerateMessageChatTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateMessageChatTokenResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GenerateMessageChatTokenResponseBody setAppSign(String appSign) {
        this.appSign = appSign;
        return this;
    }
    public String getAppSign() {
        return this.appSign;
    }

    public GenerateMessageChatTokenResponseBody setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public GenerateMessageChatTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateMessageChatTokenResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GenerateMessageChatTokenResponseBody setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public GenerateMessageChatTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GenerateMessageChatTokenResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
