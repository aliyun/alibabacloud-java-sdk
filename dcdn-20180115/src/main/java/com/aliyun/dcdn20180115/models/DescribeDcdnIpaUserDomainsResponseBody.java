// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaUserDomainsResponseBody extends TeaModel {
    /**
     * <p>The array that consists of multiple PageData parameters. The details about each accelerated domain name are included in a separate PageData parameter.</p>
     */
    @NameInMap("Domains")
    public DescribeDcdnIpaUserDomainsResponseBodyDomains domains;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of domain names returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AA75AADB-5E25-4970-B480-EAA1F5658483</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of domain names returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDcdnIpaUserDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaUserDomainsResponseBody self = new DescribeDcdnIpaUserDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaUserDomainsResponseBody setDomains(DescribeDcdnIpaUserDomainsResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeDcdnIpaUserDomainsResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeDcdnIpaUserDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnIpaUserDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnIpaUserDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnIpaUserDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSourcesSource extends TeaModel {
        /**
         * <p>The address of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>*.aliyuncs.com</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The port of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The type of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS Domain</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the origin server if multiple origin servers have been specified.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSourcesSource self = new DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSourcesSource setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSourcesSource> source;

        public static DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSources self = new DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSources setSource(java.util.List<DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData extends TeaModel {
        /**
         * <p>The CNAME assigned to the accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com.*.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The reason why the accelerated domain name failed the review.</p>
         * 
         * <strong>example:</strong>
         * <p>audit failed</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of the accelerated domain name. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: enabled</li>
         * <li><strong>offline</strong>: disabled</li>
         * <li><strong>configuring</strong>: configuring</li>
         * <li><strong>configure_failed</strong>: configuration failed</li>
         * <li><strong>checking</strong>: reviewing</li>
         * <li><strong>check_failed:</strong> review failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The time when the accelerated domain name was added to Alibaba Cloud CDN.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-10-28T09:32:51Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the accelerated domain name was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-10-28T11:05:52Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd1234abcd****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of HTTPS.</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        /**
         * <p>Indicates whether the accelerated domain name was in a sandbox.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Sandbox")
        public String sandbox;

        /**
         * <p>The information about the origin server.</p>
         */
        @NameInMap("Sources")
        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSources sources;

        public static DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData self = new DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData setSandbox(String sandbox) {
            this.sandbox = sandbox;
            return this;
        }
        public String getSandbox() {
            return this.sandbox;
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData setSources(DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeDcdnIpaUserDomainsResponseBodyDomainsPageDataSources getSources() {
            return this.sources;
        }

    }

    public static class DescribeDcdnIpaUserDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData> pageData;

        public static DescribeDcdnIpaUserDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaUserDomainsResponseBodyDomains self = new DescribeDcdnIpaUserDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaUserDomainsResponseBodyDomains setPageData(java.util.List<DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeDcdnIpaUserDomainsResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
