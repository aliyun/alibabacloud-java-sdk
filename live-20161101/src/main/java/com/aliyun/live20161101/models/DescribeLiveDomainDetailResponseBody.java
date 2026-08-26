// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the domain configuration.</p>
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
         * <p>The canonical name (CNAME). A CNAME is generated for the live streaming domain. You must add a CNAME record at your DNS provider to map the live streaming domain to this CNAME.</p>
         * <blockquote>
         * <p>Local DNS records are cached. After you add the CNAME record, it may take up to 10 minutes to take effect. For more information, see <a href="https://help.aliyun.com/document_detail/362010.html">FAQ about CNAME records</a>.</p>
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
         * <p>The ingest domain or streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of the domain. Valid values:</p>
         * <ul>
         * <li><p><strong>online</strong>: enabled.</p>
         * </li>
         * <li><p><strong>offline</strong>: disabled.</p>
         * </li>
         * <li><p><strong>configuring</strong>: being configured.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The time when the domain was added. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-27T06:51:25Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the domain was last modified. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-07T06:51Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li><p><strong>liveVideo</strong>: streaming domain.</p>
         * </li>
         * <li><p><strong>liveEdge</strong>: ingest domain.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>liveVideo</p>
         */
        @NameInMap("LiveDomainType")
        public String liveDomainType;

        /**
         * <p>The region where the domain name is added.</p>
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
         * <p>rg-<strong>k3bpq2yjw22</strong></p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether SSL is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: enabled.</p>
         * </li>
         * <li><p><strong>off</strong>: disabled.</p>
         * </li>
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
         * <li><p><strong>domestic</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>overseas</strong>: regions outside the Chinese mainland.</p>
         * </li>
         * <li><p><strong>global</strong>: global.</p>
         * </li>
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
