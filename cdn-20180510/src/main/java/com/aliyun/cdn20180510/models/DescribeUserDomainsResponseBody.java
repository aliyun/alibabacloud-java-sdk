// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public DescribeUserDomainsResponseBodyDomains domains;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

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

    public DescribeUserDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeUserDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeUserDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public String weight;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Content")
        public String content;

        public static DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource self = new DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource();
            return TeaModel.build(map, self);
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

        public DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeUserDomainsResponseBodyDomainsPageDataSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
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
        @NameInMap("SslProtocol")
        public String sslProtocol;

        @NameInMap("Sandbox")
        public String sandbox;

        @NameInMap("Sources")
        public DescribeUserDomainsResponseBodyDomainsPageDataSources sources;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("Description")
        public String description;

        @NameInMap("Coverage")
        public String coverage;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("CdnType")
        public String cdnType;

        public static DescribeUserDomainsResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserDomainsResponseBodyDomainsPageData self = new DescribeUserDomainsResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setSslProtocol(String sslProtocol) {
            this.sslProtocol = sslProtocol;
            return this;
        }
        public String getSslProtocol() {
            return this.sslProtocol;
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

        public DescribeUserDomainsResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeUserDomainsResponseBodyDomainsPageData setCdnType(String cdnType) {
            this.cdnType = cdnType;
            return this;
        }
        public String getCdnType() {
            return this.cdnType;
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
