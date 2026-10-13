// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPortalsResponseBody extends TeaModel {
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
    public ListPortalsResponseBodyData data;

    /**
     * <p>The maximum number of entries returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-xxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListPortalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPortalsResponseBody self = new ListPortalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPortalsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPortalsResponseBody setData(ListPortalsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPortalsResponseBodyData getData() {
        return this.data;
    }

    public ListPortalsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPortalsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPortalsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPortalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPortalsResponseBodyDataContent extends TeaModel {
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
         * <p>The list of portal domain configurations. The list element is named domainConfig.</p>
         */
        @NameInMap("portalDomainConfig")
        public java.util.List<HiMarketPortalDomainConfig> portalDomainConfig;

        /**
         * <p>The portal ID, which is the primary ID of the portal resource. It can be used in GetPortal, UpdatePortal, and DeletePortal to locate the portal at /himarket/v1/portals/{portalId}.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        @NameInMap("portalId")
        public String portalId;

        /**
         * <p>The portal configuration, including whether username and password authentication is enabled, whether developer registrations are automatically approved, and whether subscription requests are automatically approved.</p>
         */
        @NameInMap("portalSettingConfig")
        public HiMarketPortalSettingConfig portalSettingConfig;

        /**
         * <p>The region ID, which corresponds to the RegionId property of the portal resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static ListPortalsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListPortalsResponseBodyDataContent self = new ListPortalsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListPortalsResponseBodyDataContent setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListPortalsResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPortalsResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPortalsResponseBodyDataContent setPortalDomainConfig(java.util.List<HiMarketPortalDomainConfig> portalDomainConfig) {
            this.portalDomainConfig = portalDomainConfig;
            return this;
        }
        public java.util.List<HiMarketPortalDomainConfig> getPortalDomainConfig() {
            return this.portalDomainConfig;
        }

        public ListPortalsResponseBodyDataContent setPortalId(String portalId) {
            this.portalId = portalId;
            return this;
        }
        public String getPortalId() {
            return this.portalId;
        }

        public ListPortalsResponseBodyDataContent setPortalSettingConfig(HiMarketPortalSettingConfig portalSettingConfig) {
            this.portalSettingConfig = portalSettingConfig;
            return this;
        }
        public HiMarketPortalSettingConfig getPortalSettingConfig() {
            return this.portalSettingConfig;
        }

        public ListPortalsResponseBodyDataContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListPortalsResponseBodyData extends TeaModel {
        /**
         * <p>The list of portals. The list element is named portalConfig, and each element contains the information of a HiMarket developer portal.</p>
         */
        @NameInMap("content")
        public java.util.List<ListPortalsResponseBodyDataContent> content;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static ListPortalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPortalsResponseBodyData self = new ListPortalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPortalsResponseBodyData setContent(java.util.List<ListPortalsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListPortalsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListPortalsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPortalsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPortalsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
