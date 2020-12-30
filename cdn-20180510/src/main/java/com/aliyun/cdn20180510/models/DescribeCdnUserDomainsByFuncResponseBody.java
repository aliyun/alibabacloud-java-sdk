// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserDomainsByFuncResponseBody extends TeaModel {
    @NameInMap("Domains")
    public DescribeCdnUserDomainsByFuncResponseBodyDomains domains;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

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

    public DescribeCdnUserDomainsByFuncResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeCdnUserDomainsByFuncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnUserDomainsByFuncResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCdnUserDomainsByFuncResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource extends TeaModel {
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

        public static DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource self = new DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource();
            return TeaModel.build(map, self);
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

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
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
        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("SslProtocol")
        public String sslProtocol;

        @NameInMap("Description")
        public String description;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Sandbox")
        public String sandbox;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("Sources")
        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSources sources;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("CdnType")
        public String cdnType;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData self = new DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setSslProtocol(String sslProtocol) {
            this.sslProtocol = sslProtocol;
            return this;
        }
        public String getSslProtocol() {
            return this.sslProtocol;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setSandbox(String sandbox) {
            this.sandbox = sandbox;
            return this;
        }
        public String getSandbox() {
            return this.sandbox;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setSources(DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageDataSources getSources() {
            return this.sources;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setCdnType(String cdnType) {
            this.cdnType = cdnType;
            return this;
        }
        public String getCdnType() {
            return this.cdnType;
        }

        public DescribeCdnUserDomainsByFuncResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
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
