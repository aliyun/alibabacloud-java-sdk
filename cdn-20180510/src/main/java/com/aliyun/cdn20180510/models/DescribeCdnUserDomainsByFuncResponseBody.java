// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserDomainsByFuncResponseBody extends TeaModel {
    // The configurations of the accelerated domain name.
    @NameInMap("Domains")
    public DescribeCdnUserDomainsByFuncResponseBodyDomains domains;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeCdnUserDomainsByFuncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserDomainsByFuncResponseBody self = new DescribeCdnUserDomainsByFuncResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserDomainsByFuncResponseBody setDomains(DescribeCdnUserDomainsByFuncResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeCdnUserDomainsByFuncResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeCdnUserDomainsByFuncResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCdnUserDomainsByFuncResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCdnUserDomainsByFuncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnUserDomainsByFuncResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource extends TeaModel {
        // The address of the origin server.
        @NameInMap("Content")
        public String content;

        // The port of the origin server.
        @NameInMap("Port")
        public Integer port;

        // The priority of the configuration item.
        @NameInMap("Priority")
        public String priority;

        // The type of the origin server.
        @NameInMap("Type")
        public String type;

        // The weight of the origin server if multiple origin servers have been specified.
        @NameInMap("Weight")
        public String weight;

        public static DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource self = new DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource> source;

        public static DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSources self = new DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSources setSource(java.util.List<DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData extends TeaModel {
        // The type of workload accelerated by Alibaba Cloud CDN. Valid values:
        // 
        // *   **web**: image and small file distribution
        // *   **download**: large file distribution
        // *   **video**: on-demand video and audio streaming
        // *   **liveStream**: live streaming
        @NameInMap("CdnType")
        public String cdnType;

        // The CNAME assigned to the accelerated domain name.
        @NameInMap("Cname")
        public String cname;

        // The description of the status.
        @NameInMap("Description")
        public String description;

        // The accelerated domain name.
        @NameInMap("DomainName")
        public String domainName;

        // The status of the accelerated domain name. Valid values:
        // 
        // *   **online**: The domain name is enabled.
        // *   **offline**: The domain is disabled.
        // *   **configuring**: The endpoint group is being configured.
        // *   **configure_failed**: The domain failed to be configured.
        // *   **checking**: The domain name is under review.
        // *   **check_failed**: The domain name failed the review.
        // *   **stopping**: The domain name is be disabled.
        // *   **deleting**: being deleted
        @NameInMap("DomainStatus")
        public String domainStatus;

        // The time when the accelerated domain name was added to Alibaba Cloud CDN.
        @NameInMap("GmtCreated")
        public String gmtCreated;

        // The last time when the accelerated domain was modified.
        @NameInMap("GmtModified")
        public String gmtModified;

        // The ID of the resource group.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The information about the origin server.
        @NameInMap("Sources")
        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSources sources;

        // The status of HTTPS. Valid values:
        // 
        // - **on**: enabled
        // - **off**: disabled
        @NameInMap("SslProtocol")
        public String sslProtocol;

        public static DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData self = new DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setCdnType(String cdnType) {
            this.cdnType = cdnType;
            return this;
        }
        public String getCdnType() {
            return this.cdnType;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setSources(DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSources getSources() {
            return this.sources;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setSslProtocol(String sslProtocol) {
            this.sslProtocol = sslProtocol;
            return this;
        }
        public String getSslProtocol() {
            return this.sslProtocol;
        }

    }

    public static class DescribeCdnUserDomainsByFuncResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData> pageData;

        public static DescribeCdnUserDomainsByFuncResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserDomainsByFuncResponseBodyDomains self = new DescribeCdnUserDomainsByFuncResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomains setPageData(java.util.List<DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
