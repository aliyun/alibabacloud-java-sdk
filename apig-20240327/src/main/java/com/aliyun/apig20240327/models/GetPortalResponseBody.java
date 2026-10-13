// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetPortalResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetPortalResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetPortalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPortalResponseBody self = new GetPortalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPortalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPortalResponseBody setData(GetPortalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPortalResponseBodyData getData() {
        return this.data;
    }

    public GetPortalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPortalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPortalResponseBodyData extends TeaModel {
        /**
         * <p>The creation time in ISO 8601 (RFC 3339) format in the UTC time zone, such as 2026-05-15T10:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-15T10:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The portal description, which is the Description property of the portal resource.</p>
         * 
         * <strong>example:</strong>
         * <p>HiMarket portal for internal developers</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The portal name, which is the Name property of the portal resource.</p>
         * 
         * <strong>example:</strong>
         * <p>developer-portal</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The list of portal domain name configurations. The list element is named domainConfig.</p>
         */
        @NameInMap("portalDomainConfig")
        public java.util.List<HiMarketPortalDomainConfig> portalDomainConfig;

        /**
         * <p>The portal ID, which is the primary ID of the portal resource and points to the same portal as the portalId request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        @NameInMap("portalId")
        public String portalId;

        /**
         * <p>The portal settings, including whether to enable username and password authentication, whether to automatically approve developer registrations, and whether to automatically approve subscription requests.</p>
         */
        @NameInMap("portalSettingConfig")
        public HiMarketPortalSettingConfig portalSettingConfig;

        /**
         * <p>The region ID, which is the RegionId property of the portal resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static GetPortalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPortalResponseBodyData self = new GetPortalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPortalResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetPortalResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPortalResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPortalResponseBodyData setPortalDomainConfig(java.util.List<HiMarketPortalDomainConfig> portalDomainConfig) {
            this.portalDomainConfig = portalDomainConfig;
            return this;
        }
        public java.util.List<HiMarketPortalDomainConfig> getPortalDomainConfig() {
            return this.portalDomainConfig;
        }

        public GetPortalResponseBodyData setPortalId(String portalId) {
            this.portalId = portalId;
            return this;
        }
        public String getPortalId() {
            return this.portalId;
        }

        public GetPortalResponseBodyData setPortalSettingConfig(HiMarketPortalSettingConfig portalSettingConfig) {
            this.portalSettingConfig = portalSettingConfig;
            return this;
        }
        public HiMarketPortalSettingConfig getPortalSettingConfig() {
            return this.portalSettingConfig;
        }

        public GetPortalResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
