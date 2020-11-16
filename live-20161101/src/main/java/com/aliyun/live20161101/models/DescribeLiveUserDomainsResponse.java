// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Domains")
    @Validation(required = true)
    public DescribeLiveUserDomainsResponseDomains domains;

    public static DescribeLiveUserDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserDomainsResponse self = new DescribeLiveUserDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserDomainsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveUserDomainsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLiveUserDomainsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveUserDomainsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeLiveUserDomainsResponse setDomains(DescribeLiveUserDomainsResponseDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeLiveUserDomainsResponseDomains getDomains() {
        return this.domains;
    }

    public static class DescribeLiveUserDomainsResponseDomainsPageData extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("Cname")
        @Validation(required = true)
        public String cname;

        @NameInMap("LiveDomainType")
        @Validation(required = true)
        public String liveDomainType;

        @NameInMap("GmtCreated")
        @Validation(required = true)
        public String gmtCreated;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("LiveDomainStatus")
        @Validation(required = true)
        public String liveDomainStatus;

        @NameInMap("RegionName")
        @Validation(required = true)
        public String regionName;

        public static DescribeLiveUserDomainsResponseDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUserDomainsResponseDomainsPageData self = new DescribeLiveUserDomainsResponseDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUserDomainsResponseDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveUserDomainsResponseDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeLiveUserDomainsResponseDomainsPageData setLiveDomainType(String liveDomainType) {
            this.liveDomainType = liveDomainType;
            return this;
        }
        public String getLiveDomainType() {
            return this.liveDomainType;
        }

        public DescribeLiveUserDomainsResponseDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeLiveUserDomainsResponseDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeLiveUserDomainsResponseDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveUserDomainsResponseDomainsPageData setLiveDomainStatus(String liveDomainStatus) {
            this.liveDomainStatus = liveDomainStatus;
            return this;
        }
        public String getLiveDomainStatus() {
            return this.liveDomainStatus;
        }

        public DescribeLiveUserDomainsResponseDomainsPageData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

    public static class DescribeLiveUserDomainsResponseDomains extends TeaModel {
        @NameInMap("PageData")
        @Validation(required = true)
        public java.util.List<DescribeLiveUserDomainsResponseDomainsPageData> pageData;

        public static DescribeLiveUserDomainsResponseDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUserDomainsResponseDomains self = new DescribeLiveUserDomainsResponseDomains();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUserDomainsResponseDomains setPageData(java.util.List<DescribeLiveUserDomainsResponseDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeLiveUserDomainsResponseDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
