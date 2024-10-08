// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainDetailResponseBody extends TeaModel {
    /**
     * <p>The information about the accelerated domain name.</p>
     */
    @NameInMap("DomainDetail")
    public DescribeDcdnDomainDetailResponseBodyDomainDetail domainDetail;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>09ABE829-6CD3-4FE0-AFEE-556113E29727</p>
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
         * <p>The address of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>example.org</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        /**
         * <p>The port over which requests are redirected to the origin server. Ports 443 and 80 are supported.</p>
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
         * <p>50</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The type of the origin server. Valid values:</p>
         * <ul>
         * <li><strong>ipaddr</strong>: an IP address</li>
         * <li><strong>domain</strong>: an origin domain name</li>
         * <li><strong>oss</strong>: the domain name of an Object Storage Service (OSS) bucket</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the origin server if multiple origin servers are specified.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The information about the Internet content provider (ICP) filing of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing ICP Filing No. 1703xxxx</p>
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
         * <li><strong>online</strong></li>
         * <li><strong>offline</strong></li>
         * <li><strong>configuring</strong></li>
         * <li><strong>configure_failed</strong></li>
         * <li><strong>checking</strong></li>
         * <li><strong>check_failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>Computing service type. Valid values:</p>
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
         * <p>The time when the domain name was added.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-27T06:51:26Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the domain name was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-27T06:51:25Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyuji4b6r4**</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the Security Socket Layer (SSL) certificate is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: <strong>enabled</strong></li>
         * <li><strong>off</strong>: <strong>disabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        /**
         * <p>The public key of the certificate if HTTPS is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("SSLPub")
        public String SSLPub;

        /**
         * <p>Acceleration scenario. Valid values:</p>
         * <ul>
         * <li><strong>apiscene</strong>: API acceleration.</li>
         * <li><strong>webservicescene</strong>: website acceleration.</li>
         * <li><strong>staticscene</strong>: video, image, and text acceleration.</li>
         * <li><strong>an empty string</strong>: no acceleration scenario is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>apiscene</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The acceleration region. Default value: domestic. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: Chinese mainland</li>
         * <li><strong>overseas</strong>: global (excluding the Chinese mainland)</li>
         * <li><strong>global</strong>: global</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>overseas</p>
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

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setFunctionType(String functionType) {
            this.functionType = functionType;
            return this;
        }
        public String getFunctionType() {
            return this.functionType;
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

        public DescribeDcdnDomainDetailResponseBodyDomainDetail setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
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
