// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainDetailResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the accelerated domain name.</p>
     */
    @NameInMap("DomainDetail")
    public DescribeDcdnDomainDetailResponseBodyDomainDetail domainDetail;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainDetailResponseBody self = new DescribeDcdnDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainDetailResponseBody setDomainDetail(DescribeDcdnDomainDetailResponseBodyDomainDetail domainDetail) {
        this.domainDetail = domainDetail;
        return this;
    }
    public DescribeDcdnDomainDetailResponseBodyDomainDetail getDomainDetail() {
        return this.domainDetail;
    }

    public DescribeDcdnDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource extends TeaModel {
        /**
         * <p>The origin address.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The status of the origin server.</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        /**
         * <p>The port over which back-to-origin requests are transmitted. Ports 443 and 80 are supported.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the origin server.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The type of origin server. Valid values:</p>
         * <br>
         * <p>*   **ipaddr**: the IP address of the origin server.</p>
         * <p>*   **domain**: the domain name of the origin server.</p>
         * <p>*   **oss**: the URL of an Object Storage Service (OSS) bucket.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the origin server if multiple origin servers have been specified.</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource self = new DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class DescribeDcdnDomainDetailResponseBodyDomainDetailSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource> source;

        public static DescribeDcdnDomainDetailResponseBodyDomainDetailSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainDetailResponseBodyDomainDetailSources self = new DescribeDcdnDomainDetailResponseBodyDomainDetailSources();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetailSources setSource(java.util.List<DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeDcdnDomainDetailResponseBodyDomainDetailSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeDcdnDomainDetailResponseBodyDomainDetail extends TeaModel {
        /**
         * <p>The CNAME that is assigned to the accelerated domain name. You must add the CNAME record to the system of your Domain Name System (DNS) provider to map the accelerated domain name to the CNAME.</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The information about the Internet content provider (ICP) filing of the domain name.</p>
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
         * <p>*   **online**: The domain name is enabled.</p>
         * <p>*   **offline**: The domain name is disabled.</p>
         * <p>*   **configuring**: The domain name is being configured.</p>
         * <p>*   **configure_failed**: The domain name has failed to be configured.</p>
         * <p>*   **checking**: The domain name is under review.</p>
         * <p>*   **check_failed**: The domain name has failed the review.</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The time when the accelerated domain name was created.</p>
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
         * <p>Indicates whether the Security Socket Layer (SSL) certificate is enabled. Valid values:</p>
         * <br>
         * <p>*   **on**: **enabled**.</p>
         * <p>*   **off**: **disabled**.</p>
         */
        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        /**
         * <p>Indicates the public key of the certificate if the HTTPS protocol is enabled.</p>
         */
        @NameInMap("SSLPub")
        public String SSLPub;

        /**
         * <p>The region where your acceleration service is deployed.</p>
         * <br>
         * <p>*   **domestic**: Chinese mainland. This is the default value.</p>
         * <p>*   **overseas**: outside the Chinese mainland.</p>
         * <p>*   **global**: all the countries in the world.</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The information about the origin server.</p>
         */
        @NameInMap("Sources")
        public DescribeDcdnDomainDetailResponseBodyDomainDetailSources sources;

        public static DescribeDcdnDomainDetailResponseBodyDomainDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainDetailResponseBodyDomainDetail self = new DescribeDcdnDomainDetailResponseBodyDomainDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setSSLPub(String SSLPub) {
            this.SSLPub = SSLPub;
            return this;
        }
        public String getSSLPub() {
            return this.SSLPub;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setSources(DescribeDcdnDomainDetailResponseBodyDomainDetailSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeDcdnDomainDetailResponseBodyDomainDetailSources getSources() {
            return this.sources;
        }

    }

}
