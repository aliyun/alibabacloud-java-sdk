// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserDomainsResponseBody extends TeaModel {
    /**
     * <p>The information about the queried domains.</p>
     */
    @NameInMap("Domains")
    public DescribeDcdnUserDomainsResponseBodyDomains domains;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
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
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDcdnUserDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserDomainsResponseBody self = new DescribeDcdnUserDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserDomainsResponseBody setDomains(DescribeDcdnUserDomainsResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeDcdnUserDomainsResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeDcdnUserDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnUserDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnUserDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnUserDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource extends TeaModel {
        /**
         * <p>The address of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
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
         * <p>The priority of the origin server.</p>
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
         * <p>oss</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource self = new DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource> source;

        public static DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources self = new DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources setSource(java.util.List<DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeDcdnUserDomainsResponseBodyDomainsPageDataSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeDcdnUserDomainsResponseBodyDomainsPageData extends TeaModel {
        /**
         * <p>The CNAME of the domain.</p>
         * 
         * <strong>example:</strong>
         * <p>test.aliyun.com.w.alikunlun.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The reason why the domain failed the review.</p>
         * 
         * <strong>example:</strong>
         * <p>audit failed</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11223344</p>
         */
        @NameInMap("DomainId")
        public Long domainId;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The domain status.</p>
         * <ul>
         * <li><strong>online</strong>: The domain is active.</li>
         * <li><strong>offline</strong>: The domain is suspended.</li>
         * <li><strong>configuring</strong>: The domain is being configured.</li>
         * <li><strong>configure_failed</strong>: The domain failed to be configured.</li>
         * <li><strong>checking</strong>: The domain is under review.</li>
         * <li><strong>check_failed</strong>: The domain failed the review.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The computing service type. Valid values:</p>
         * <ul>
         * <li><strong>routine</strong></li>
         * <li><strong>image</strong></li>
         * <li><strong>cloudFunction</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>routine</p>
         */
        @NameInMap("FunctionType")
        public String functionType;

        /**
         * <p>The time when the domain was added to DCDN.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-10-28T11:05:50Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the domain was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-10-28T09:31:59Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmv6jutt**</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether HTTPS was enabled.</p>
         * <ul>
         * <li><strong>on</strong>: enabled.</li>
         * <li><strong>off</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        /**
         * <p>The sandbox status.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Sandbox")
        public String sandbox;

        /**
         * <p>The acceleration scenario. Valid values:</p>
         * <ul>
         * <li><strong>apiscene</strong>: accelerates response to API calls.</li>
         * <li><strong>webservicescene</strong>: accelerates content delivery for websites.</li>
         * <li><strong>staticscene</strong>: accelerates the delivery of videos, images, and text.</li>
         * <li>**If you leave this parameter empty, no scenarios are supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>apiscene</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The information about the origin servers.</p>
         */
        @NameInMap("Sources")
        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources sources;

        public static DescribeDcdnUserDomainsResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsResponseBodyDomainsPageData self = new DescribeDcdnUserDomainsResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setFunctionType(String functionType) {
            this.functionType = functionType;
            return this;
        }
        public String getFunctionType() {
            return this.functionType;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setSandbox(String sandbox) {
            this.sandbox = sandbox;
            return this;
        }
        public String getSandbox() {
            return this.sandbox;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeDcdnUserDomainsResponseBodyDomainsPageData setSources(DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeDcdnUserDomainsResponseBodyDomainsPageDataSources getSources() {
            return this.sources;
        }

    }

    public static class DescribeDcdnUserDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeDcdnUserDomainsResponseBodyDomainsPageData> pageData;

        public static DescribeDcdnUserDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsResponseBodyDomains self = new DescribeDcdnUserDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsResponseBodyDomains setPageData(java.util.List<DescribeDcdnUserDomainsResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeDcdnUserDomainsResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
