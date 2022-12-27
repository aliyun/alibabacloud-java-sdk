// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserDomainsResponseBody extends TeaModel {
    // The information about the accelerated domain name.
    @NameInMap("Domains")
    public DescribeUserDomainsResponseBodyDomains domains;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates the total number of entries returned.
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
        // The address of the origin server.
        @NameInMap("Content")
        public String content;

        // The port of the origin server.
        @NameInMap("Port")
        public Integer port;

        // The priority of the origin server.
        @NameInMap("Priority")
        public String priority;

        // The type of the origin server.
        @NameInMap("Type")
        public String type;

        // The weight of the origin server if multiple origin servers are specified.
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
        // The type of workload accelerated by Alibaba Cloud CDN. Valid values:
        // 
        // *   **web**: images and small files
        // *   **download**: large files
        // *   **video**: on-demand video and audio streaming
        @NameInMap("CdnType")
        public String cdnType;

        // The CNAME assigned to the accelerated domain name.
        @NameInMap("Cname")
        public String cname;

        // The acceleration region. Valid values:
        // 
        // *   **domestic**: Chinese mainland
        // *   **global**
        // *   **overseas**: global (excluding the Chinese mainland)
        @NameInMap("Coverage")
        public String coverage;

        // The information about the Internet Content Provider (ICP) number.
        @NameInMap("Description")
        public String description;

        // The ID of the accelerated domain name.
        @NameInMap("DomainId")
        public Long domainId;

        // The accelerated domain names.
        @NameInMap("DomainName")
        public String domainName;

        // The status of the accelerated domain name. Valid values:
        // 
        // *   **online**: enabled
        // *   **offline**: disabled
        // *   **configuring**: being configured
        // *   **configure_failed**: failed to be configured
        // *   **checking**: under review
        // *   **check_failed**: failed the review
        // *   **stopping**: being disabled
        // *   **deleting**: deleting
        @NameInMap("DomainStatus")
        public String domainStatus;

        // The time when the accelerated domain name was added to Alibaba Cloud CDN.
        @NameInMap("GmtCreated")
        public String gmtCreated;

        // The time when the accelerated domain name was last modified.
        @NameInMap("GmtModified")
        public String gmtModified;

        // The ID of the resource group.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // Indicates whether the accelerated domain name is in a sandbox.
        @NameInMap("Sandbox")
        public String sandbox;

        // The information about the origin server.
        @NameInMap("Sources")
        public DescribeUserDomainsResponseBodyDomainsPageDataSources sources;

        // Indicates whether HTTPS is enabled. Valid values:
        // 
        // *   **on**: enabled
        // *   **off**: disabled
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
