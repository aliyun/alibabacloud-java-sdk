// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class FindIdpListByLoginIdentifierResponseBody extends TeaModel {
    @NameInMap("IdpInfos")
    public java.util.List<FindIdpListByLoginIdentifierResponseBodyIdpInfos> idpInfos;

    @NameInMap("OfficeSiteInfo")
    public FindIdpListByLoginIdentifierResponseBodyOfficeSiteInfo officeSiteInfo;

    @NameInMap("PopRegionConfig")
    public java.util.Map<String, String> popRegionConfig;

    /**
     * <strong>example:</strong>
     * <p>cn_hangzhou</p>
     */
    @NameInMap("ProfileRegion")
    public String profileRegion;

    /**
     * <strong>example:</strong>
     * <p>AD2D0761-1FE5-549D-B169-D3F8D19C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TenantAliasInfo")
    public FindIdpListByLoginIdentifierResponseBodyTenantAliasInfo tenantAliasInfo;

    public static FindIdpListByLoginIdentifierResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindIdpListByLoginIdentifierResponseBody self = new FindIdpListByLoginIdentifierResponseBody();
        return TeaModel.build(map, self);
    }

    public FindIdpListByLoginIdentifierResponseBody setIdpInfos(java.util.List<FindIdpListByLoginIdentifierResponseBodyIdpInfos> idpInfos) {
        this.idpInfos = idpInfos;
        return this;
    }
    public java.util.List<FindIdpListByLoginIdentifierResponseBodyIdpInfos> getIdpInfos() {
        return this.idpInfos;
    }

    public FindIdpListByLoginIdentifierResponseBody setOfficeSiteInfo(FindIdpListByLoginIdentifierResponseBodyOfficeSiteInfo officeSiteInfo) {
        this.officeSiteInfo = officeSiteInfo;
        return this;
    }
    public FindIdpListByLoginIdentifierResponseBodyOfficeSiteInfo getOfficeSiteInfo() {
        return this.officeSiteInfo;
    }

    public FindIdpListByLoginIdentifierResponseBody setPopRegionConfig(java.util.Map<String, String> popRegionConfig) {
        this.popRegionConfig = popRegionConfig;
        return this;
    }
    public java.util.Map<String, String> getPopRegionConfig() {
        return this.popRegionConfig;
    }

    public FindIdpListByLoginIdentifierResponseBody setProfileRegion(String profileRegion) {
        this.profileRegion = profileRegion;
        return this;
    }
    public String getProfileRegion() {
        return this.profileRegion;
    }

    public FindIdpListByLoginIdentifierResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindIdpListByLoginIdentifierResponseBody setTenantAliasInfo(FindIdpListByLoginIdentifierResponseBodyTenantAliasInfo tenantAliasInfo) {
        this.tenantAliasInfo = tenantAliasInfo;
        return this;
    }
    public FindIdpListByLoginIdentifierResponseBodyTenantAliasInfo getTenantAliasInfo() {
        return this.tenantAliasInfo;
    }

    public static class FindIdpListByLoginIdentifierResponseBodyIdpInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>simple</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Cookies")
        public String cookies;

        /**
         * <strong>example:</strong>
         * <p>idp-hlyexfvwert9m8****</p>
         */
        @NameInMap("IdpId")
        public String idpId;

        @NameInMap("IdpName")
        public String idpName;

        @NameInMap("IdpProvider")
        public String idpProvider;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("JumpSwitch")
        public String jumpSwitch;

        /**
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("SsoProtocol")
        public String ssoProtocol;

        @NameInMap("SsoServiceUrl")
        public String ssoServiceUrl;

        public static FindIdpListByLoginIdentifierResponseBodyIdpInfos build(java.util.Map<String, ?> map) throws Exception {
            FindIdpListByLoginIdentifierResponseBodyIdpInfos self = new FindIdpListByLoginIdentifierResponseBodyIdpInfos();
            return TeaModel.build(map, self);
        }

        public FindIdpListByLoginIdentifierResponseBodyIdpInfos setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public FindIdpListByLoginIdentifierResponseBodyIdpInfos setCookies(String cookies) {
            this.cookies = cookies;
            return this;
        }
        public String getCookies() {
            return this.cookies;
        }

        public FindIdpListByLoginIdentifierResponseBodyIdpInfos setIdpId(String idpId) {
            this.idpId = idpId;
            return this;
        }
        public String getIdpId() {
            return this.idpId;
        }

        public FindIdpListByLoginIdentifierResponseBodyIdpInfos setIdpName(String idpName) {
            this.idpName = idpName;
            return this;
        }
        public String getIdpName() {
            return this.idpName;
        }

        public FindIdpListByLoginIdentifierResponseBodyIdpInfos setIdpProvider(String idpProvider) {
            this.idpProvider = idpProvider;
            return this;
        }
        public String getIdpProvider() {
            return this.idpProvider;
        }

        public FindIdpListByLoginIdentifierResponseBodyIdpInfos setJumpSwitch(String jumpSwitch) {
            this.jumpSwitch = jumpSwitch;
            return this;
        }
        public String getJumpSwitch() {
            return this.jumpSwitch;
        }

        public FindIdpListByLoginIdentifierResponseBodyIdpInfos setSsoProtocol(String ssoProtocol) {
            this.ssoProtocol = ssoProtocol;
            return this;
        }
        public String getSsoProtocol() {
            return this.ssoProtocol;
        }

        public FindIdpListByLoginIdentifierResponseBodyIdpInfos setSsoServiceUrl(String ssoServiceUrl) {
            this.ssoServiceUrl = ssoServiceUrl;
            return this;
        }
        public String getSsoServiceUrl() {
            return this.ssoServiceUrl;
        }

    }

    public static class FindIdpListByLoginIdentifierResponseBodyOfficeSiteInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai+dir-448204****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("ProviderId")
        public String providerId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SsoServiceUrl")
        public String ssoServiceUrl;

        public static FindIdpListByLoginIdentifierResponseBodyOfficeSiteInfo build(java.util.Map<String, ?> map) throws Exception {
            FindIdpListByLoginIdentifierResponseBodyOfficeSiteInfo self = new FindIdpListByLoginIdentifierResponseBodyOfficeSiteInfo();
            return TeaModel.build(map, self);
        }

        public FindIdpListByLoginIdentifierResponseBodyOfficeSiteInfo setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public FindIdpListByLoginIdentifierResponseBodyOfficeSiteInfo setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public FindIdpListByLoginIdentifierResponseBodyOfficeSiteInfo setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public FindIdpListByLoginIdentifierResponseBodyOfficeSiteInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public FindIdpListByLoginIdentifierResponseBodyOfficeSiteInfo setSsoServiceUrl(String ssoServiceUrl) {
            this.ssoServiceUrl = ssoServiceUrl;
            return this;
        }
        public String getSsoServiceUrl() {
            return this.ssoServiceUrl;
        }

    }

    public static class FindIdpListByLoginIdentifierResponseBodyTenantAliasInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <strong>example:</strong>
         * <p>Or09****</p>
         */
        @NameInMap("TenantAlias")
        public String tenantAlias;

        public static FindIdpListByLoginIdentifierResponseBodyTenantAliasInfo build(java.util.Map<String, ?> map) throws Exception {
            FindIdpListByLoginIdentifierResponseBodyTenantAliasInfo self = new FindIdpListByLoginIdentifierResponseBodyTenantAliasInfo();
            return TeaModel.build(map, self);
        }

        public FindIdpListByLoginIdentifierResponseBodyTenantAliasInfo setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public FindIdpListByLoginIdentifierResponseBodyTenantAliasInfo setTenantAlias(String tenantAlias) {
            this.tenantAlias = tenantAlias;
            return this;
        }
        public String getTenantAlias() {
            return this.tenantAlias;
        }

    }

}
