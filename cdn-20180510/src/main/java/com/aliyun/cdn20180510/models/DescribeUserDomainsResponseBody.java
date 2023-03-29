// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserDomainsResponseBody extends TeaModel {
    /**
     * <p>The information about the accelerated domain name.</p>
     */
    @NameInMap("Domains")
    public DescribeUserDomainsResponseBodyDomains domains;

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
     * <p>Indicates the total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeUserDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDomainsResponseBody self = new DescribeUserDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserDomainsResponseBody setDomains(DescribeUserDomainsResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeUserDomainsResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeUserDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeUserDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource extends TeaModel {
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
         * <p>The priority of the origin server.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The type of the origin server.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the origin server if multiple origin servers are specified.</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource self = new DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class DescribeUserDomainsResponseBodyDomainsPageDataSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource> source;

        public static DescribeUserDomainsResponseBodyDomainsPageDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserDomainsResponseBodyDomainsPageDataSources self = new DescribeUserDomainsResponseBodyDomainsPageDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeUserDomainsResponseBodyDomainsPageDataSources setSource(java.util.List<DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeUserDomainsResponseBodyDomainsPageData extends TeaModel {
        /**
         * <p>The type of workload accelerated by Alibaba Cloud CDN. Valid values:</p>
         * <br>
         * <p>*   **web**: images and small files</p>
         * <p>*   **download**: large files</p>
         * <p>*   **video**: on-demand video and audio streaming</p>
         */
        @NameInMap("CdnType")
        public String cdnType;

        /**
         * <p>The CNAME assigned to the accelerated domain name.</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The acceleration region. Valid values:</p>
         * <br>
         * <p>*   **domestic**: Chinese mainland</p>
         * <p>*   **global**</p>
         * <p>*   **overseas**: global (excluding the Chinese mainland)</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The information about the Internet Content Provider (ICP) number.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the accelerated domain name.</p>
         */
        @NameInMap("DomainId")
        public Long domainId;

        /**
         * <p>The accelerated domain names.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of the accelerated domain name. Valid values:</p>
         * <br>
         * <p>*   **online**: enabled</p>
         * <p>*   **offline**: disabled</p>
         * <p>*   **configuring**: being configured</p>
         * <p>*   **configure_failed**: failed to be configured</p>
         * <p>*   **checking**: under review</p>
         * <p>*   **check_failed**: failed the review</p>
         * <p>*   **stopping**: being disabled</p>
         * <p>*   **deleting**: deleting</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The time when the accelerated domain name was added to Alibaba Cloud CDN.</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the accelerated domain name was last modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the accelerated domain name is in a sandbox.</p>
         */
        @NameInMap("Sandbox")
        public String sandbox;

        /**
         * <p>The information about the origin server.</p>
         */
        @NameInMap("Sources")
        public DescribeUserDomainsResponseBodyDomainsPageDataSources sources;

        /**
         * <p>Indicates whether HTTPS is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: enabled</p>
         * <p>*   **off**: disabled</p>
         */
        @NameInMap("SslProtocol")
        public String sslProtocol;

        public static DescribeUserDomainsResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserDomainsResponseBodyDomainsPageData self = new DescribeUserDomainsResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setCdnType(String cdnType) {
            this.cdnType = cdnType;
            return this;
        }
        public String getCdnType() {
            return this.cdnType;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setSandbox(String sandbox) {
            this.sandbox = sandbox;
            return this;
        }
        public String getSandbox() {
            return this.sandbox;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setSources(DescribeUserDomainsResponseBodyDomainsPageDataSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeUserDomainsResponseBodyDomainsPageDataSources getSources() {
            return this.sources;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setSslProtocol(String sslProtocol) {
            this.sslProtocol = sslProtocol;
            return this;
        }
        public String getSslProtocol() {
            return this.sslProtocol;
        }

    }

    public static class DescribeUserDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeUserDomainsResponseBodyDomainsPageData> pageData;

        public static DescribeUserDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserDomainsResponseBodyDomains self = new DescribeUserDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeUserDomainsResponseBodyDomains setPageData(java.util.List<DescribeUserDomainsResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeUserDomainsResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
