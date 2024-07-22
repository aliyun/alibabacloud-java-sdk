// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class GetLoginTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <strong>example:</strong>
     * <p>ad</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <strong>example:</strong>
     * <p>easthp***.com</p>
     */
    @NameInMap("AdDomain")
    public String adDomain;

    /**
     * <strong>example:</strong>
     * <p>alice***@aliyun.com</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <strong>example:</strong>
     * <p>idp-7ttvs4ove8bo5***</p>
     */
    @NameInMap("IdpId")
    public String idpId;

    /**
     * <strong>example:</strong>
     * <p>edu</p>
     */
    @NameInMap("Industry")
    public String industry;

    /**
     * <strong>example:</strong>
     * <p>006YwvYMsesWWsDBZnVB+Wq9AvJDVIqOY3YCktvtb7+KxMb3ClnNlV8+l/knhZYrXUmeP06IzkjF+IgcZ3vZKOyMprDyFHjCy1r27FRE/U7+geWCl8iQ+yF8GaCRHfJEkC2+ROs93HkT4tfHxyY1J8W7O7ZQGUC/cdCvm+cCP6FIy73IUuPuVR6PcKYXIp***</p>
     */
    @NameInMap("KeepAliveToken")
    public String keepAliveToken;

    /**
     * <strong>example:</strong>
     * <p>test:wuying</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <strong>example:</strong>
     * <p>v185fdd7f6d39fa7861981639366085772e150a390a5bb7b43c4e62440d94fc392b945770e1596cebe90085ce0af4d****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <strong>example:</strong>
     * <p>MFABind</p>
     */
    @NameInMap("NextStage")
    public String nextStage;

    @NameInMap("OfficeSites")
    public java.util.List<String> officeSites;

    @NameInMap("PasswordStrategy")
    public GetLoginTokenResponseBodyPasswordStrategy passwordStrategy;

    /**
     * <strong>example:</strong>
     * <p>1826717****</p>
     */
    @NameInMap("Phone")
    public String phone;

    @NameInMap("Props")
    public java.util.Map<String, String> props;

    /**
     * <strong>example:</strong>
     * <p>5OCLLKKOJU5HPBX66H3QCTWY******</p>
     */
    @NameInMap("QrCodePng")
    public String qrCodePng;

    /**
     * <strong>example:</strong>
     * <p>PasswordExpired</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <strong>example:</strong>
     * <p>EEA72491-B731-53D6-83ED-209769D6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskVerifyInfo")
    public GetLoginTokenResponseBodyRiskVerifyInfo riskVerifyInfo;

    /**
     * <strong>example:</strong>
     * <p>4JZNSDHDM3T6AZ4G2O5OWXBLLE4P****</p>
     */
    @NameInMap("Secret")
    public String secret;

    /**
     * <strong>example:</strong>
     * <p>cc15c91c-821b-4edd-9af2-6df66cc****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>Rq201***</p>
     */
    @NameInMap("TenantAlias")
    public String tenantAlias;

    /**
     * <strong>example:</strong>
     * <p>13747924304****</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("TenantInfos")
    public java.util.List<GetLoginTokenResponseBodyTenantInfos> tenantInfos;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("VpcRegionId")
    public String vpcRegionId;

    /**
     * <strong>example:</strong>
     * <p>Windowed</p>
     */
    @NameInMap("WindowDisplayMode")
    public String windowDisplayMode;

    /**
     * <strong>example:</strong>
     * <p>0aba1403b337a***</p>
     */
    @NameInMap("WyId")
    public String wyId;

    public static GetLoginTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginTokenResponseBody self = new GetLoginTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginTokenResponseBody setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public GetLoginTokenResponseBody setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public GetLoginTokenResponseBody setAdDomain(String adDomain) {
        this.adDomain = adDomain;
        return this;
    }
    public String getAdDomain() {
        return this.adDomain;
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

    public GetLoginTokenResponseBody setIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }
    public String getIdpId() {
        return this.idpId;
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

    public GetLoginTokenResponseBody setOfficeSites(java.util.List<String> officeSites) {
        this.officeSites = officeSites;
        return this;
    }
    public java.util.List<String> getOfficeSites() {
        return this.officeSites;
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

    public GetLoginTokenResponseBody setTenantAlias(String tenantAlias) {
        this.tenantAlias = tenantAlias;
        return this;
    }
    public String getTenantAlias() {
        return this.tenantAlias;
    }

    public GetLoginTokenResponseBody setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public GetLoginTokenResponseBody setTenantInfos(java.util.List<GetLoginTokenResponseBodyTenantInfos> tenantInfos) {
        this.tenantInfos = tenantInfos;
        return this;
    }
    public java.util.List<GetLoginTokenResponseBodyTenantInfos> getTenantInfos() {
        return this.tenantInfos;
    }

    public GetLoginTokenResponseBody setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
        return this;
    }
    public String getVpcRegionId() {
        return this.vpcRegionId;
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
        @NameInMap("TenantAlternativeChars")
        public java.util.List<String> tenantAlternativeChars;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TenantPasswordLength")
        public Integer tenantPasswordLength;

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

        public GetLoginTokenResponseBodyPasswordStrategy setTenantPasswordLength(Integer tenantPasswordLength) {
            this.tenantPasswordLength = tenantPasswordLength;
            return this;
        }
        public Integer getTenantPasswordLength() {
            return this.tenantPasswordLength;
        }

    }

    public static class GetLoginTokenResponseBodyRiskVerifyInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ppas***@aliyun.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("LastLockDuration")
        public Long lastLockDuration;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Locked")
        public Boolean locked;

        /**
         * <strong>example:</strong>
         * <p>1826717****</p>
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

        public GetLoginTokenResponseBodyRiskVerifyInfo setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
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

    public static class GetLoginTokenResponseBodyTenantInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <strong>example:</strong>
         * <p>Up830***</p>
         */
        @NameInMap("TenantAlias")
        public String tenantAlias;

        public static GetLoginTokenResponseBodyTenantInfos build(java.util.Map<String, ?> map) throws Exception {
            GetLoginTokenResponseBodyTenantInfos self = new GetLoginTokenResponseBodyTenantInfos();
            return TeaModel.build(map, self);
        }

        public GetLoginTokenResponseBodyTenantInfos setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public GetLoginTokenResponseBodyTenantInfos setTenantAlias(String tenantAlias) {
            this.tenantAlias = tenantAlias;
            return this;
        }
        public String getTenantAlias() {
            return this.tenantAlias;
        }

    }

}
