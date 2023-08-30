// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserDomainsByFuncResponseBody extends TeaModel {
    /**
     * <p>The array that consists of multiple PageData parameters. The details about each accelerated domain name are included in a separate PageData parameter.</p>
     */
    @NameInMap("Domains")
    public DescribeDcdnUserDomainsByFuncResponseBodyDomains domains;

    /**
     * <p>The page number of the page returned.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of domain names returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDcdnUserDomainsByFuncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserDomainsByFuncResponseBody self = new DescribeDcdnUserDomainsByFuncResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserDomainsByFuncResponseBody setDomains(DescribeDcdnUserDomainsByFuncResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeDcdnUserDomainsByFuncResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeDcdnUserDomainsByFuncResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnUserDomainsByFuncResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnUserDomainsByFuncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnUserDomainsByFuncResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource extends TeaModel {
        /**
         * <p>The origin server address.</p>
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
         * <p>The type of the origin server.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the origin server if multiple origin servers have been specified.</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource self = new DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource> source;

        public static DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources self = new DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources setSource(java.util.List<DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData extends TeaModel {
        /**
         * <p>The CNAME assigned to the accelerated domain name.</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The reason why the accelerated domain name failed the review.</p>
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
         * <p>*   **online**</p>
         * <p>*   **offline**</p>
         * <p>*   **configuring**</p>
         * <p>*   **configure_failed**</p>
         * <p>*   **checking**</p>
         * <p>*   **check_failed**</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The time when the accelerated domain name was added to Dynamic Content Delivery Network (DCDN).</p>
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
         * <p>Indicates whether the accelerated domain name was in a sandbox.</p>
         */
        @NameInMap("Sandbox")
        public String sandbox;

        /**
         * <p>The information about the origin servers.</p>
         */
        @NameInMap("Sources")
        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources sources;

        /**
         * <p>Indicates whether HTTPS is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: HTTPS is enabled.</p>
         * <p>*   **off**: HTTPS is disabled.</p>
         */
        @NameInMap("SslProtocol")
        public String sslProtocol;

        public static DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData self = new DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setSandbox(String sandbox) {
            this.sandbox = sandbox;
            return this;
        }
        public String getSandbox() {
            return this.sandbox;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setSources(DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageDataSources getSources() {
            return this.sources;
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData setSslProtocol(String sslProtocol) {
            this.sslProtocol = sslProtocol;
            return this;
        }
        public String getSslProtocol() {
            return this.sslProtocol;
        }

    }

    public static class DescribeDcdnUserDomainsByFuncResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData> pageData;

        public static DescribeDcdnUserDomainsByFuncResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsByFuncResponseBodyDomains self = new DescribeDcdnUserDomainsByFuncResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsByFuncResponseBodyDomains setPageData(java.util.List<DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeDcdnUserDomainsByFuncResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
