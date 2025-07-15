// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainDetailResponseBody extends TeaModel {
    /**
     * <p>The configuration details of the domain name.</p>
     */
    @NameInMap("DomainDetail")
    public DescribeLiveDomainDetailResponseBodyDomainDetail domainDetail;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>09ABE829-6CD3-4FE0-AFEE-556113E29727</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainDetailResponseBody self = new DescribeLiveDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainDetailResponseBody setDomainDetail(DescribeLiveDomainDetailResponseBodyDomainDetail domainDetail) {
        this.domainDetail = domainDetail;
        return this;
    }
    public DescribeLiveDomainDetailResponseBodyDomainDetail getDomainDetail() {
        return this.domainDetail;
    }

    public DescribeLiveDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDomainDetailResponseBodyDomainDetail extends TeaModel {
        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>liveCert****</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The CNAME that is assigned to the domain name. You must add a CNAME record in the system of your Domain Name System (DNS) service provider to map the domain name to the CNAME.</p>
         * <blockquote>
         * <p> A time-to-live (TTL) value is specified in the CNAME record of a domain name to indicate how long the CNAME record can be cached on the DNS resolver. If you modify the CNAME record of the domain name, the new settings take effect after the cache expires, which takes about 10 minutes. For more information, see <a href="https://help.aliyun.com/document_detail/362010.html">CNAME resolution</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>learn.developer.aliyundoc.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The description of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The streaming domain or ingest domain.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: The domain name is enabled.</li>
         * <li><strong>offline</strong>: The domain name is disabled.</li>
         * <li><strong>configuring</strong>: The domain is being configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The time when the domain name was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-27T06:51:25Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the domain name was last modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-07T06:51Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>liveVideo</strong>: streaming domain</li>
         * <li><strong>liveEdge</strong>: ingest domain</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>liveVideo</p>
         */
        @NameInMap("LiveDomainType")
        public String liveDomainType;

        /**
         * <p>The ID of the region where the domain name resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2ogvt4nwmi7i</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the SSL certificate is enabled. Valid values:</p>
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
         * <p>The public key of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Public Key</p>
         */
        @NameInMap("SSLPub")
        public String SSLPub;

        /**
         * <p>The acceleration region. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: regions in the Chinese mainland.</li>
         * <li><strong>overseas</strong>: regions outside the Chinese mainland.</li>
         * <li><strong>global</strong>: regions in and outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        @NameInMap("Scope")
        public String scope;

        public static DescribeLiveDomainDetailResponseBodyDomainDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainDetailResponseBodyDomainDetail self = new DescribeLiveDomainDetailResponseBodyDomainDetail();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setLiveDomainType(String liveDomainType) {
            this.liveDomainType = liveDomainType;
            return this;
        }
        public String getLiveDomainType() {
            return this.liveDomainType;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setSSLPub(String SSLPub) {
            this.SSLPub = SSLPub;
            return this;
        }
        public String getSSLPub() {
            return this.SSLPub;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

}
