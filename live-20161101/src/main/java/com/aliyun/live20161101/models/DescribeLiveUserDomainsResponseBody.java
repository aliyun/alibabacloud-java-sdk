// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public DescribeLiveUserDomainsResponseBodyDomains domains;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

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

    public DescribeLiveUserDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeLiveUserDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveUserDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveUserDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeLiveUserDomainsResponseBodyDomainsPageData extends TeaModel {
        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("LiveDomainType")
        public String liveDomainType;

        @NameInMap("LiveDomainStatus")
        public String liveDomainStatus;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeLiveUserDomainsResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUserDomainsResponseBodyDomainsPageData self = new DescribeLiveUserDomainsResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setLiveDomainType(String liveDomainType) {
            this.liveDomainType = liveDomainType;
            return this;
        }
        public String getLiveDomainType() {
            return this.liveDomainType;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setLiveDomainStatus(String liveDomainStatus) {
            this.liveDomainStatus = liveDomainStatus;
            return this;
        }
        public String getLiveDomainStatus() {
            return this.liveDomainStatus;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeLiveUserDomainsResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
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
