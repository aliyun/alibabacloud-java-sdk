// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public DescribeLiveUserDomainsResponseBodyDomains domains;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E4EBD2BF-5EB0-4476-8829-9D94E1B15267</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeLiveUserDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserDomainsResponseBody self = new DescribeLiveUserDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserDomainsResponseBody setDomains(DescribeLiveUserDomainsResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeLiveUserDomainsResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeLiveUserDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLiveUserDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveUserDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveUserDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLiveUserDomainsResponseBodyDomainsPageData extends TeaModel {
        @NameInMap("Cname")
        public String cname;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("LiveDomainStatus")
        public String liveDomainStatus;

        @NameInMap("LiveDomainType")
        public String liveDomainType;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static DescribeLiveUserDomainsResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUserDomainsResponseBodyDomainsPageData self = new DescribeLiveUserDomainsResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setLiveDomainStatus(String liveDomainStatus) {
            this.liveDomainStatus = liveDomainStatus;
            return this;
        }
        public String getLiveDomainStatus() {
            return this.liveDomainStatus;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setLiveDomainType(String liveDomainType) {
            this.liveDomainType = liveDomainType;
            return this;
        }
        public String getLiveDomainType() {
            return this.liveDomainType;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class DescribeLiveUserDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeLiveUserDomainsResponseBodyDomainsPageData> pageData;

        public static DescribeLiveUserDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUserDomainsResponseBodyDomains self = new DescribeLiveUserDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUserDomainsResponseBodyDomains setPageData(java.util.List<DescribeLiveUserDomainsResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeLiveUserDomainsResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
