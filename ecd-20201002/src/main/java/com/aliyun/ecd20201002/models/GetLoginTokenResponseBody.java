// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetLoginTokenResponseBody extends TeaModel {
    /**
     * <p>The email address of the user. This value is returned with the LoginToken after logon.    </p>
     * <ul>
     * <li>For a convenience user, the email address specified when the convenience user was created is returned.</li>
     * <li>For an AD user, the value is returned in the format of <code>username@AD domain name</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The convenience account username or AD username.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <blockquote>
     * <p>This is an internal field and is not available for public use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>edu</p>
     */
    @NameInMap("Industry")
    public String industry;

    /**
     * <p>The token used to keep the logon session alive. After a successful logon with the keep-alive option enabled, the operation returns a <code>KeepAliveToken</code>. If the keep-alive option is not enabled, an empty value is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>006YwvYMsesWWsDBZnVB+Wq9AvJDVIqOY3YCktvtb7+KxMb3ClnNlV8+l/knhZYrXUmeP06IzkjF+IgcZ3vZKOyMprDyFHjCy1r27FRE/U7+geWCl8iQ+yF8GaCRHfJEkC2+ROs93HkT4tfHxyY1J8W7O7ZQGUC/cdCvm+cCP6FIy73IUuPuVR6PcKYXIpEZPW</p>
     */
    @NameInMap("KeepAliveToken")
    public String keepAliveToken;

    /**
     * <p>The property of the convenience user. If the user is an AD user, an empty value is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>test:wuying</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The logon credential.</p>
     * 
     * <strong>example:</strong>
     * <p>v18101ac6a9e69c66b04a163031680463660b4b216cd758f34b60b9ad6a7c7f7334b83dd8f75eef4209c68f9f1080b****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The expected next stage. For example, if the administrator has enabled MFA authentication in the Elastic Desktop Service console, after the username and password authentication is passed (the <code>ADPassword</code> stage), this parameter returns <code>MFAVerify</code>, indicating that MFA authentication is required.</p>
     * <blockquote>
     * <p>For more information about each authentication stage, see the parameter description of the <code>CurrentStage</code> request parameter of this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MFAVerify</p>
     */
    @NameInMap("NextStage")
    public String nextStage;

    @NameInMap("NickName")
    public String nickName;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <blockquote>
     * <p>This is an internal field and is not available for public use.</p>
     * </blockquote>
     */
    @NameInMap("PasswordStrategy")
    public GetLoginTokenResponseBodyPasswordStrategy passwordStrategy;

    /**
     * <p>The phone number of the convenience user. If the user is an AD user, an empty value is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1381111****</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <blockquote>
     * <p>This is an internal field and is not available for public use.</p>
     * </blockquote>
     */
    @NameInMap("Props")
    public java.util.Map<String, String> props;

    /**
     * <p>The QR code of the secret key used when attaching a virtual MFA device. The value uses Base64 encoding. This value can be empty and is used in the <code>MFABind</code> stage.</p>
     * <blockquote>
     * <p>For more information about each authentication stage, see the parameter description of the <code>CurrentStage</code> request parameter of this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5OCLLKKOJU5HPBX66H3QCTWY******</p>
     */
    @NameInMap("QrCodePng")
    public String qrCodePng;

    /**
     * <blockquote>
     * <p>This is an internal field and is not available for public use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The logon risk identification information.</p>
     */
    @NameInMap("RiskVerifyInfo")
    public GetLoginTokenResponseBodyRiskVerifyInfo riskVerifyInfo;

    /**
     * <p>The secret key used when attaching a virtual MFA device. This value is used in the <code>MFABind</code> stage.</p>
     * <blockquote>
     * <p>For more information about each authentication stage, see the parameter description of the <code>CurrentStage</code> request parameter of this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5OCLLKKOJU5HPBX66H3QCTWYI7MH****</p>
     */
    @NameInMap("Secret")
    public String secret;

    /**
     * <p>The session ID. This value is returned only when <code>GetLoginToken</code> is invoked for the first time within the same session. For subsequent stages that require multiple authentications, pass in this parameter.</p>
     * <blockquote>
     * <p>For more information about each authentication stage, see the parameter description of the <code>CurrentStage</code> request parameter of this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d6ec166d-ab93-4286-bf7f-a18bb929****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The Alibaba Cloud account ID. This value is used for hardware terminal identification.</p>
     * 
     * <strong>example:</strong>
     * <p>166353906220****</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    /**
     * <blockquote>
     * <p>This is an internal field and is not available for public use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mode</p>
     */
    @NameInMap("WindowDisplayMode")
    public String windowDisplayMode;

    @NameInMap("WyId")
    public String wyId;

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

    public GetLoginTokenResponseBody setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public GetLoginTokenResponseBody setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public GetLoginTokenResponseBody setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
        return this;
    }
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public GetLoginTokenResponseBody setPasswordStrategy(GetLoginTokenResponseBodyPasswordStrategy passwordStrategy) {
        this.passwordStrategy = passwordStrategy;
        return this;
    }
    public GetLoginTokenResponseBodyPasswordStrategy getPasswordStrategy() {
        return this.passwordStrategy;
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

    public GetLoginTokenResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
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

    public GetLoginTokenResponseBody setWyId(String wyId) {
        this.wyId = wyId;
        return this;
    }
    public String getWyId() {
        return this.wyId;
    }

    public static class GetLoginTokenResponseBodyPasswordStrategy extends TeaModel {
        /**
         * <blockquote>
         * <p>This is an internal field and is not available for public use.</p>
         * </blockquote>
         */
        @NameInMap("TenantAlternativeChars")
        public java.util.List<String> tenantAlternativeChars;

        /**
         * <blockquote>
         * <p>This is an internal field and is not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TenantPasswordLength")
        public String tenantPasswordLength;

        public static GetLoginTokenResponseBodyPasswordStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetLoginTokenResponseBodyPasswordStrategy self = new GetLoginTokenResponseBodyPasswordStrategy();
            return TeaModel.build(map, self);
        }

        public GetLoginTokenResponseBodyPasswordStrategy setTenantAlternativeChars(java.util.List<String> tenantAlternativeChars) {
            this.tenantAlternativeChars = tenantAlternativeChars;
            return this;
        }
        public java.util.List<String> getTenantAlternativeChars() {
            return this.tenantAlternativeChars;
        }

        public GetLoginTokenResponseBodyPasswordStrategy setTenantPasswordLength(String tenantPasswordLength) {
            this.tenantPasswordLength = tenantPasswordLength;
            return this;
        }
        public String getTenantPasswordLength() {
            return this.tenantPasswordLength;
        }

    }

    public static class GetLoginTokenResponseBodyRiskVerifyInfo extends TeaModel {
        /**
         * <p>The email address used for identity verification when risk verification is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user@example.com">user@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The account lockout duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1713749778</p>
         */
        @NameInMap("LastLockDuration")
        public Long lastLockDuration;

        /**
         * <p>Indicates whether the account is locked.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Locked")
        public String locked;

        /**
         * <p>The phone number used for identity verification when risk verification is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
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
