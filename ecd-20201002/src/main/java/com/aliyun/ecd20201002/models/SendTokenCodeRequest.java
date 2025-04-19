// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SendTokenCodeRequest extends TeaModel {
    /**
     * <p>The client ID. The system generates a unique ID for each client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f4a0dc8e-1702-4728-9a60-95b27a35****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The operating system on which the client runs.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows_NT 10.0.18363 x64</p>
     */
    @NameInMap("ClientOS")
    public String clientOS;

    /**
     * <p>The client version. If you use an Alibaba Cloud Workspace client, you can view the client version in the &quot;About&quot; dialog box on the client logon page.</p>
     * 
     * <strong>example:</strong>
     * <p>2.1.0-R-20210731.151756</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The username of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The logon token.</p>
     * 
     * <strong>example:</strong>
     * <p>v28101ac6a9e69c66b04a163031680463660b4b216cd758f34b60b9ad6a7c7f7334b83dd8f75eef4209c68f9f1080b****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-2925105532</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cd45e873-650d-4d70-acb9-f996187a****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>If two-factor authentication is enabled for clients in the Elastic Desktop Service (EDS) Enterprise console, the system will send a verification code to the user\&quot;s email address if it detects that the current logged-on user is at risk. This parameter is required if you set <code>CurrentStage</code> to <code>TokenVerify</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>63****</p>
     */
    @NameInMap("TokenCode")
    public String tokenCode;

    public static SendTokenCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendTokenCodeRequest self = new SendTokenCodeRequest();
        return TeaModel.build(map, self);
    }

    public SendTokenCodeRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public SendTokenCodeRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public SendTokenCodeRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public SendTokenCodeRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public SendTokenCodeRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public SendTokenCodeRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public SendTokenCodeRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendTokenCodeRequest setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
        return this;
    }
    public String getTokenCode() {
        return this.tokenCode;
    }

}
