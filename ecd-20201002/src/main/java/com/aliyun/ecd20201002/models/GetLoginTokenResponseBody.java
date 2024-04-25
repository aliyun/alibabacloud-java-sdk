// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetLoginTokenResponseBody extends TeaModel {
    /**
     * <p>The email address of the user. The system returns the email address in the return value of the LoginToken parameter after the user logs on to the client.</p>
     * <br>
     * <p>*   For a convenience user, the return value is the email address specified when the administrator creates the convenience user.</p>
     * <p>*   For an AD user, the return value is in the following format: `Username@Name of the AD domain`.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The account of the convenience user or the AD user.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>> This is a parameter only for internal use.</p>
     */
    @NameInMap("Industry")
    public String industry;

    /**
     * <p>The token used to keep the user logged on. After the user logs on to the client and select the Keep Logon option, `KeepAliveToken` is returned when you call the operation. If the user does not select the Keep Logon option, null is returned.</p>
     */
    @NameInMap("KeepAliveToken")
    public String keepAliveToken;

    /**
     * <p>The attribute of the convenience user. For an AD user, null is returned.</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The logon token.</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The next stage that is expected to enter. For example, if the administrator enables MFA authentication in the EDS console, `MFAVerify` is returned after the username and password pass the authentication (after you set CurrentStage to `ADPassword` stage). This indicates that the MFA authentication is required.</p>
     * <br>
     * <p>> For more information about each authentication stage, see the parameter description of the request parameter `CurrentStage`.</p>
     */
    @NameInMap("NextStage")
    public String nextStage;

    /**
     * <p>Enter the mobile number of the convenience user. For an AD user, null is returned.</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>> This is a parameter only for internal use.</p>
     */
    @NameInMap("Props")
    public java.util.Map<String, String> props;

    /**
     * <p>The QR code that is generated when the virtual MFA device is bound. The value is encoded in Base64. This parameter can be empty. This parameter is required only when the CurrentStage parameter is set to `MFABind`.</p>
     * <br>
     * <p>> For more information about each authentication stage, see the parameter description of the request parameter `CurrentStage`.</p>
     */
    @NameInMap("QrCodePng")
    public String qrCodePng;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskVerifyInfo")
    public GetLoginTokenResponseBodyRiskVerifyInfo riskVerifyInfo;

    /**
     * <p>The key that is generated when you bind the virtual MFA device. This parameter is required when the CurrentStage parameter is set to `MFABind`.</p>
     * <br>
     * <p>> For more information about each authentication stage, see the parameter description of the request parameter `CurrentStage`.</p>
     */
    @NameInMap("Secret")
    public String secret;

    /**
     * <p>The ID of the session. The ID is returned the first time you call the `GetLoginToken` operation in the session. If MFA is required, you must specify this parameter in subsequent stages.</p>
     * <br>
     * <p>> For more information about each authentication stage, see the parameter description of the request parameter `CurrentStage`.</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The ID of the Alibaba Cloud account. The ID is used for hardware client authentication.</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    /**
     * <p>> This is a parameter only for internal use.</p>
     */
    @NameInMap("WindowDisplayMode")
    public String windowDisplayMode;

    public static GetLoginTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginTokenResponseBody self = new GetLoginTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginTokenResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GetLoginTokenResponseBody setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GetLoginTokenResponseBody setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public GetLoginTokenResponseBody setKeepAliveToken(String keepAliveToken) {
        this.keepAliveToken = keepAliveToken;
        return this;
    }
    public String getKeepAliveToken() {
        return this.keepAliveToken;
    }

    public GetLoginTokenResponseBody setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public GetLoginTokenResponseBody setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public GetLoginTokenResponseBody setNextStage(String nextStage) {
        this.nextStage = nextStage;
        return this;
    }
    public String getNextStage() {
        return this.nextStage;
    }

    public GetLoginTokenResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GetLoginTokenResponseBody setProps(java.util.Map<String, String> props) {
        this.props = props;
        return this;
    }
    public java.util.Map<String, String> getProps() {
        return this.props;
    }

    public GetLoginTokenResponseBody setQrCodePng(String qrCodePng) {
        this.qrCodePng = qrCodePng;
        return this;
    }
    public String getQrCodePng() {
        return this.qrCodePng;
    }

    public GetLoginTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoginTokenResponseBody setRiskVerifyInfo(GetLoginTokenResponseBodyRiskVerifyInfo riskVerifyInfo) {
        this.riskVerifyInfo = riskVerifyInfo;
        return this;
    }
    public GetLoginTokenResponseBodyRiskVerifyInfo getRiskVerifyInfo() {
        return this.riskVerifyInfo;
    }

    public GetLoginTokenResponseBody setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public GetLoginTokenResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetLoginTokenResponseBody setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public GetLoginTokenResponseBody setWindowDisplayMode(String windowDisplayMode) {
        this.windowDisplayMode = windowDisplayMode;
        return this;
    }
    public String getWindowDisplayMode() {
        return this.windowDisplayMode;
    }

    public static class GetLoginTokenResponseBodyRiskVerifyInfo extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("LastLockDuration")
        public Long lastLockDuration;

        @NameInMap("Locked")
        public String locked;

        @NameInMap("Phone")
        public String phone;

        public static GetLoginTokenResponseBodyRiskVerifyInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLoginTokenResponseBodyRiskVerifyInfo self = new GetLoginTokenResponseBodyRiskVerifyInfo();
            return TeaModel.build(map, self);
        }

        public GetLoginTokenResponseBodyRiskVerifyInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetLoginTokenResponseBodyRiskVerifyInfo setLastLockDuration(Long lastLockDuration) {
            this.lastLockDuration = lastLockDuration;
            return this;
        }
        public Long getLastLockDuration() {
            return this.lastLockDuration;
        }

        public GetLoginTokenResponseBodyRiskVerifyInfo setLocked(String locked) {
            this.locked = locked;
            return this;
        }
        public String getLocked() {
            return this.locked;
        }

        public GetLoginTokenResponseBodyRiskVerifyInfo setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

}
