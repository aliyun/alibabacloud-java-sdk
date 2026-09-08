// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetLoginDetailsResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Logon information data.</p>
     */
    @NameInMap("Data")
    public GetLoginDetailsResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Response parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F1A4774A-F28B-5C40-AEF6-D88D2DD6C7E4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLoginDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginDetailsResponseBody self = new GetLoginDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLoginDetailsResponseBody setData(GetLoginDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLoginDetailsResponseBodyData getData() {
        return this.data;
    }

    public GetLoginDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLoginDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLoginDetailsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetLoginDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLoginDetailsResponseBodyData extends TeaModel {
        /**
         * <p>Agent data push server URL. After a successful connection, the server pushes agent status data to the agent Workbench.</p>
         * 
         * <strong>example:</strong>
         * <p>sh-wss-ccc.aliyuncs.com</p>
         */
        @NameInMap("AgentServerUrl")
        public String agentServerUrl;

        /**
         * <p>Agent profile picture URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://abc.com/sam.jpb">http://abc.com/sam.jpb</a></p>
         */
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        /**
         * <p>Chat session application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7pjxxx</p>
         */
        @NameInMap("ChatAppId")
        public String chatAppId;

        /**
         * <p>Chat session application key.</p>
         * 
         * <strong>example:</strong>
         * <p>955e4bd7xxxxxxxxxxxxxd7898ba9fa0d0</p>
         */
        @NameInMap("ChatAppKey")
        public String chatAppKey;

        /**
         * <p>Chat Device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4c51c9116c36537cb850dc1081d745df</p>
         */
        @NameInMap("ChatDeviceId")
        public String chatDeviceId;

        /**
         * <p>Chat session logon token.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;accessToken&quot;:&quot;oauth_cloud_key:4xxx0=&quot;,&quot;accessTokenExpiredTime&quot;:864xxxx,&quot;refreshToken&quot;:&quot;oauth_cloud_key:Paxxxx==&quot;}</p>
         */
        @NameInMap("ChatLoginToken")
        public String chatLoginToken;

        /**
         * <p>Chat session server URL.</p>
         * 
         * <strong>example:</strong>
         * <p>wss://wss.im.dingtalk.cn</p>
         */
        @NameInMap("ChatServerUrl")
        public String chatServerUrl;

        /**
         * <p>Chat session Device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A-8000100x</p>
         */
        @NameInMap("ChatUserId")
        public String chatUserId;

        /**
         * <p>SIP device extension number. This field is required when using a SIP phone.</p>
         * 
         * <strong>example:</strong>
         * <p>8033****</p>
         */
        @NameInMap("DeviceExt")
        public String deviceExt;

        /**
         * <p>If the agent has registered an SIP phone, this parameter is the Device ID of the SIP phone device; otherwise, it is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Yealink SIP-T23G 44.84.XX.XX</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>SIP device status.</p>
         * 
         * <strong>example:</strong>
         * <p>OFFLINE</p>
         */
        @NameInMap("DeviceState")
        public String deviceState;

        /**
         * <p>Agent display name.</p>
         * 
         * <strong>example:</strong>
         * <p>坐席小王</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Agent extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>8001****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>Agent nickname</p>
         * 
         * <strong>example:</strong>
         * <p>老王</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>Signature information generated using an asymmetric key encryption algorithm. This information is required for authentication when registering with the SIP server.</p>
         * 
         * <strong>example:</strong>
         * <p>zi31STIMtIfa/UN2l+6lww****</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>Signature information generated using an asymmetric key encryption algorithm. This information is required for authentication when registering with the SIP server.</p>
         * 
         * <strong>example:</strong>
         * <p>zi31STIMtIfa/UN2l+6lww****</p>
         */
        @NameInMap("Signature2")
        public String signature2;

        /**
         * <p>SIP registration server URL. The agent must register with the server as an SIP user to perform transactional processing (TP) operations.</p>
         * 
         * <strong>example:</strong>
         * <p>sh-sip-ccc.aliyuncs.com:443</p>
         */
        @NameInMap("SipServerUrl")
        public String sipServerUrl;

        /**
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Signature data used to generate signature information. Because this signature mechanism does not support Chinese characters, UserKey2 is currently used for signing instead.</p>
         * 
         * <strong>example:</strong>
         * <p>坐席@aliyun:802001:1656406628862</p>
         */
        @NameInMap("UserKey")
        public String userKey;

        /**
         * <p>Signature data used to generate signature information. UserKey2 was added because UserKey does not support Chinese characters in signatures.</p>
         * 
         * <strong>example:</strong>
         * <p>802001:1656406628862&quot;</p>
         */
        @NameInMap("UserKey2")
        public String userKey2;

        /**
         * <p>Work mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

        public static GetLoginDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLoginDetailsResponseBodyData self = new GetLoginDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLoginDetailsResponseBodyData setAgentServerUrl(String agentServerUrl) {
            this.agentServerUrl = agentServerUrl;
            return this;
        }
        public String getAgentServerUrl() {
            return this.agentServerUrl;
        }

        public GetLoginDetailsResponseBodyData setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetLoginDetailsResponseBodyData setChatAppId(String chatAppId) {
            this.chatAppId = chatAppId;
            return this;
        }
        public String getChatAppId() {
            return this.chatAppId;
        }

        public GetLoginDetailsResponseBodyData setChatAppKey(String chatAppKey) {
            this.chatAppKey = chatAppKey;
            return this;
        }
        public String getChatAppKey() {
            return this.chatAppKey;
        }

        public GetLoginDetailsResponseBodyData setChatDeviceId(String chatDeviceId) {
            this.chatDeviceId = chatDeviceId;
            return this;
        }
        public String getChatDeviceId() {
            return this.chatDeviceId;
        }

        public GetLoginDetailsResponseBodyData setChatLoginToken(String chatLoginToken) {
            this.chatLoginToken = chatLoginToken;
            return this;
        }
        public String getChatLoginToken() {
            return this.chatLoginToken;
        }

        public GetLoginDetailsResponseBodyData setChatServerUrl(String chatServerUrl) {
            this.chatServerUrl = chatServerUrl;
            return this;
        }
        public String getChatServerUrl() {
            return this.chatServerUrl;
        }

        public GetLoginDetailsResponseBodyData setChatUserId(String chatUserId) {
            this.chatUserId = chatUserId;
            return this;
        }
        public String getChatUserId() {
            return this.chatUserId;
        }

        public GetLoginDetailsResponseBodyData setDeviceExt(String deviceExt) {
            this.deviceExt = deviceExt;
            return this;
        }
        public String getDeviceExt() {
            return this.deviceExt;
        }

        public GetLoginDetailsResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetLoginDetailsResponseBodyData setDeviceState(String deviceState) {
            this.deviceState = deviceState;
            return this;
        }
        public String getDeviceState() {
            return this.deviceState;
        }

        public GetLoginDetailsResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetLoginDetailsResponseBodyData setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetLoginDetailsResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public GetLoginDetailsResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetLoginDetailsResponseBodyData setSignature2(String signature2) {
            this.signature2 = signature2;
            return this;
        }
        public String getSignature2() {
            return this.signature2;
        }

        public GetLoginDetailsResponseBodyData setSipServerUrl(String sipServerUrl) {
            this.sipServerUrl = sipServerUrl;
            return this;
        }
        public String getSipServerUrl() {
            return this.sipServerUrl;
        }

        public GetLoginDetailsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetLoginDetailsResponseBodyData setUserKey(String userKey) {
            this.userKey = userKey;
            return this;
        }
        public String getUserKey() {
            return this.userKey;
        }

        public GetLoginDetailsResponseBodyData setUserKey2(String userKey2) {
            this.userKey2 = userKey2;
            return this;
        }
        public String getUserKey2() {
            return this.userKey2;
        }

        public GetLoginDetailsResponseBodyData setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

}
