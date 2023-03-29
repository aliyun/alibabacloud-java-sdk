// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserDomainsByFuncResponseBody extends TeaModel {
    /**
     * <p>The configurations of the accelerated domain name.</p>
     */
    @NameInMap("Domains")
    public DescribeCdnUserDomainsByFuncResponseBodyDomains domains;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of domain names returned.</p>
     */
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
        /**
         * <p>The address of the origin server.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The port of the origin server.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The type of the origin server. Valid values:</p>
         * <br>
         * <p>*   **ipaddr**: an origin IP address</p>
         * <p>*   **domain:** a domain name</p>
         * <p>*   **oss:** the OSS domain of an Object Storage Service (OSS) bucket</p>
         * <p>*   **fc_domain:** a Function Compute domain name</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the origin server if multiple origin servers have been specified.</p>
         */
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
        /**
         * <p>The type of the workload accelerated by Alibaba Cloud CDN. Valid values:</p>
         * <br>
         * <p>*   **web**: image and small file distribution</p>
         * <p>*   **download**: large file distribution</p>
         * <p>*   **video**: on-demand video and audio streaming</p>
         * <p>*   **liveStream**: live streaming</p>
         */
        @NameInMap("CdnType")
        public String cdnType;

        /**
         * <p>The CNAME assigned to the accelerated domain name.</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The description of the accelerated domain name.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of the accelerated domain name. Valid values:</p>
         * <br>
         * <p>*   **online:** enabled</p>
         * <p>*   **offline:** disabled</p>
         * <p>*   **configuring:** configuring</p>
         * <p>*   **configure_failed:** configuration failed</p>
         * <p>*   **checking:** reviewing</p>
         * <p>*   **check_failed**: failed the review</p>
         * <p>*   **stopping**: being disabled</p>
         * <p>*   **deleting**: deleting</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The time when the accelerated domain name was added.</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the accelerated domain name was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The information about the origin server.</p>
         */
        @NameInMap("Sources")
        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSources sources;

        /**
         * <p>Indicates whether HTTPS is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**</p>
         * <p>*   **off**</p>
         */
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
