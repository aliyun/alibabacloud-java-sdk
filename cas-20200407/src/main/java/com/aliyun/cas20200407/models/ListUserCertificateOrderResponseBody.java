// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListUserCertificateOrderResponseBody extends TeaModel {
    /**
     * <p>The certificate and order list.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CertificateOrderList&quot;: [{&quot;Status&quot;: &quot;PAYED&quot;,&quot;ProductName&quot;: &quot;专业版通配符 OV SSL&quot;,&quot;InstanceId&quot;: &quot;cert-instanceId&quot;,&quot;ProductCode&quot;: &quot;globalsign-xxxx&quot;,&quot;SourceType&quot;: &quot;buy&quot;,&quot;WildDomainCount&quot;: 1,&quot;CertType&quot;: &quot;OV&quot;,&quot;PartnerOrderId&quot;: &quot;&quot;,&quot;OrderId&quot;: 3451111,&quot;Algorithm&quot;: &quot;RSA&quot;,&quot;RootBrand&quot;: &quot;GlobalSign&quot;,&quot;AliyunOrderId&quot;: 21xxxxxx40655,&quot;DomainType&quot;: &quot;WILDCARD&quot;,&quot;TrusteeStatus&quot;: &quot;trustee&quot;,&quot;Domain&quot;: &quot;&quot;,&quot;BuyDate&quot;: 1632649385000,&quot;DomainCount&quot;: 1}]}</p>
     */
    @NameInMap("CertificateOrderList")
    public java.util.List<ListUserCertificateOrderResponseBodyCertificateOrderList> certificateOrderList;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListUserCertificateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserCertificateOrderResponseBody self = new ListUserCertificateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserCertificateOrderResponseBody setCertificateOrderList(java.util.List<ListUserCertificateOrderResponseBodyCertificateOrderList> certificateOrderList) {
        this.certificateOrderList = certificateOrderList;
        return this;
    }
    public java.util.List<ListUserCertificateOrderResponseBodyCertificateOrderList> getCertificateOrderList() {
        return this.certificateOrderList;
    }

    public ListUserCertificateOrderResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListUserCertificateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserCertificateOrderResponseBody setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListUserCertificateOrderResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserCertificateOrderResponseBodyCertificateOrderList extends TeaModel {
        /**
         * <p>The algorithm. Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The Alibaba Cloud order ID. Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>234567</p>
         */
        @NameInMap("AliyunOrderId")
        public Long aliyunOrderId;

        /**
         * <p>The purchase time. Unit: milliseconds. Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>1634283958000</p>
         */
        @NameInMap("BuyDate")
        public Long buyDate;

        /**
         * <p>The certificate expiration time. Unit: milliseconds. Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>1665819958000</p>
         */
        @NameInMap("CertEndTime")
        public Long certEndTime;

        /**
         * <p>The certificate start time. Unit: milliseconds. Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>1665819958000</p>
         */
        @NameInMap("CertStartTime")
        public Long certStartTime;

        /**
         * <p>The certificate type. Returned when OrderType is set to CPACK or BUY. Valid values:</p>
         * <ul>
         * <li><strong>DV</strong>: DV certificate.</li>
         * <li><strong>EV</strong>: EV certificate.</li>
         * <li><strong>OV</strong>: OV certificate.</li>
         * <li><strong>FREE</strong>: personal test certificate (supported only on the China site).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FREE</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The certificate ID. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>896521</p>
         */
        @NameInMap("CertificateId")
        public Long certificateId;

        /**
         * <p>The city. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州市</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The common name of the certificate. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The country code. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>The domain name. Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The total number of purchased domain names. Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DomainCount")
        public Long domainCount;

        /**
         * <p>The domain name type. Returned when OrderType is set to CPACK or BUY. Valid values:</p>
         * <ul>
         * <li><strong>ONE</strong>: single domain name.</li>
         * <li><strong>MULTIPLE</strong>: multiple domain names.</li>
         * <li><strong>WILDCARD</strong>: single wildcard domain name.</li>
         * <li><strong>M_WILDCARD</strong>: multiple wildcard domain names.</li>
         * <li><strong>MIX</strong>: hybrid domain names.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONE</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>The certificate end date. Returned when OrderType is set to CERT or UPLOAD. The date is in the YYYY-MM-DD format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-17</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>Indicates whether the certificate has expired. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The certificate fingerprint. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>CC6B3696E7C7CA715BD26E28E45FF3E3DF435C03</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-instanceId</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The certificate issuer. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>MyIssuer</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The certificate name. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The order ID. Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>2345687</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The organization name of the certificate. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云</p>
         */
        @NameInMap("OrgName")
        public String orgName;

        /**
         * <p>The third-party CA order ID. Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-123456</p>
         */
        @NameInMap("PartnerOrderId")
        public String partnerOrderId;

        /**
         * <p>The order specification ID. Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>bykj123456</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The order specification name. Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>CFCA</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The province or autonomous region. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>The resource group ID. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ae******4wia</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The brand (such as WoSign, CFCA, DigiCert, and vTrus). Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>CFCA</p>
         */
        @NameInMap("RootBrand")
        public String rootBrand;

        /**
         * <p>All domain names bound to the certificate. Multiple domain names are separated by commas (,). Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <p>The certificate serial number. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>040a6e493cffdda6d744acf99b6576cf</p>
         */
        @NameInMap("SerialNo")
        public String serialNo;

        /**
         * <p>The SHA-2 value of the certificate. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>56B4DED2243A81DD909D7C39824FFE4DDBD87F91BFA46CD333FF212FE0E7CB11</p>
         */
        @NameInMap("Sha2")
        public String sha2;

        /**
         * <p>The order type. Returned when OrderType is set to CPACK or BUY. Valid values:</p>
         * <ul>
         * <li><strong>cpack</strong>: resource virtual order.</li>
         * <li><strong>buy</strong>: purchase order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>buy</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The certificate start date. Returned when OrderType is set to CERT or UPLOAD. The date is in the YYYY-MM-DD format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-16</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The order or certificate status. Returned when OrderType is set to CPACK or BUY. Valid values:</p>
         * <ul>
         * <li><strong>PAYED</strong>: Pending application.</li>
         * <li><strong>CHECKING</strong>: Under review.</li>
         * <li><strong>CHECKED_FAIL</strong>: Review failed.</li>
         * <li><strong>ISSUED</strong>: Issued.</li>
         * <li><strong>WILLEXPIRED</strong>: About to expire.</li>
         * <li><strong>EXPIRED</strong>: Expired.</li>
         * <li><strong>NOTACTIVATED</strong>: Not activated.</li>
         * <li><strong>REVOKED</strong>: Revoked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAYED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The hosting status. Returned when OrderType is set to CPACK or BUY. Valid values:</p>
         * <ul>
         * <li><strong>unTrustee</strong>: Not hosted.</li>
         * <li><strong>trustee</strong>: Hosted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>unTrustee</p>
         */
        @NameInMap("TrusteeStatus")
        public String trusteeStatus;

        /**
         * <p>Indicates whether the certificate is an uploaded certificate. Returned when OrderType is set to CERT or UPLOAD.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Upload")
        public Boolean upload;

        /**
         * <p>The number of purchased wildcard domain names. Returned when OrderType is set to CPACK or BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WildDomainCount")
        public Long wildDomainCount;

        public static ListUserCertificateOrderResponseBodyCertificateOrderList build(java.util.Map<String, ?> map) throws Exception {
            ListUserCertificateOrderResponseBodyCertificateOrderList self = new ListUserCertificateOrderResponseBodyCertificateOrderList();
            return TeaModel.build(map, self);
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setAliyunOrderId(Long aliyunOrderId) {
            this.aliyunOrderId = aliyunOrderId;
            return this;
        }
        public Long getAliyunOrderId() {
            return this.aliyunOrderId;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setBuyDate(Long buyDate) {
            this.buyDate = buyDate;
            return this;
        }
        public Long getBuyDate() {
            return this.buyDate;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setCertEndTime(Long certEndTime) {
            this.certEndTime = certEndTime;
            return this;
        }
        public Long getCertEndTime() {
            return this.certEndTime;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setCertStartTime(Long certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public Long getCertStartTime() {
            return this.certStartTime;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setCertificateId(Long certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public Long getCertificateId() {
            return this.certificateId;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setDomainCount(Long domainCount) {
            this.domainCount = domainCount;
            return this;
        }
        public Long getDomainCount() {
            return this.domainCount;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setPartnerOrderId(String partnerOrderId) {
            this.partnerOrderId = partnerOrderId;
            return this;
        }
        public String getPartnerOrderId() {
            return this.partnerOrderId;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setRootBrand(String rootBrand) {
            this.rootBrand = rootBrand;
            return this;
        }
        public String getRootBrand() {
            return this.rootBrand;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setTrusteeStatus(String trusteeStatus) {
            this.trusteeStatus = trusteeStatus;
            return this;
        }
        public String getTrusteeStatus() {
            return this.trusteeStatus;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setUpload(Boolean upload) {
            this.upload = upload;
            return this;
        }
        public Boolean getUpload() {
            return this.upload;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setWildDomainCount(Long wildDomainCount) {
            this.wildDomainCount = wildDomainCount;
            return this;
        }
        public Long getWildDomainCount() {
            return this.wildDomainCount;
        }

    }

}
