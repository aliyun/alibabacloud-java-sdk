// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListUserCertificateOrderResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information about the certificates and orders.</p>
     */
    @NameInMap("CertificateOrderList")
    public java.util.List<ListUserCertificateOrderResponseBodyCertificateOrderList> certificateOrderList;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The algorithm. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The ID of the Alibaba Cloud order. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         */
        @NameInMap("AliyunOrderId")
        public Long aliyunOrderId;

        /**
         * <p>The time at which the order was placed. Unit: milliseconds. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         */
        @NameInMap("BuyDate")
        public Long buyDate;

        /**
         * <p>The time at which the certificate expires. Unit: milliseconds. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         */
        @NameInMap("CertEndTime")
        public Long certEndTime;

        /**
         * <p>The time at which the certificate starts to take effect. Unit: milliseconds. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         */
        @NameInMap("CertStartTime")
        public Long certStartTime;

        /**
         * <p>The type of the certificate. This parameter is returned only if OrderType is set to CPACK or BUY. Valid values:</p>
         * <br>
         * <p>*   **DV**: domain validated (DV) certificate</p>
         * <p>*   **EV**: extended validation (EV) certificate</p>
         * <p>*   **OV**: organization validated (OV) certificate</p>
         * <p>*   **FREE**: free certificate</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The ID of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("CertificateId")
        public Long certificateId;

        /**
         * <p>The city in which the organization is located. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The parent domain name of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The code of the country in which the organization is located. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>The domain name. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The total number of domain names that can be bound to the certificate. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         */
        @NameInMap("DomainCount")
        public Long domainCount;

        /**
         * <p>The type of the domain name. This parameter is returned only if OrderType is set to CPACK or BUY. Valid values:</p>
         * <br>
         * <p>*   **ONE**: single domain name</p>
         * <p>*   **MULTIPLE**: multiple domain names</p>
         * <p>*   **WILDCARD**: single wildcard domain name</p>
         * <p>*   **M_WILDCARD**: multiple wildcard domain names</p>
         * <p>*   **MIX**: hybrid domain name</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>The time at which the certificate expires. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>Indicates whether the certificate expires. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The fingerprint of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The issuer of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The name of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The order ID. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The name of the organization that is associated with the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("OrgName")
        public String orgName;

        /**
         * <p>The ID of the certificate authority (CA) order. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         */
        @NameInMap("PartnerOrderId")
        public String partnerOrderId;

        /**
         * <p>The specification ID of the order. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The specification name of the order. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The name of the province or autonomous region in which the organization is located. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>The ID of the resource group. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The brand of the certificate. Valid values: WoSign, CFCA, DigiCert, and vTrus. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         */
        @NameInMap("RootBrand")
        public String rootBrand;

        /**
         * <p>All domain names that are bound to the certificate. Multiple domain names are separated by commas (,). This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <p>The serial number of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("SerialNo")
        public String serialNo;

        /**
         * <p>The SHA-2 value of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("Sha2")
        public String sha2;

        /**
         * <p>The type of the order. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         * <br>
         * <p>*   **cpack**: virtual resource order</p>
         * <p>*   **buy**: purchase order</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The time at which the certificate starts to take effect. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The certificate status of the order. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         * <br>
         * <p>*   **PAYED**: pending application</p>
         * <p>*   **CHECKING**: reviewing</p>
         * <p>*   **CHECKED_FAIL**: review failed</p>
         * <p>*   **ISSUED**: issued</p>
         * <p>*   **WILLEXPIRED**: about to expire</p>
         * <p>*   **EXPIRED**: expired</p>
         * <p>*   **NOTACTIVATED**: not activated</p>
         * <p>*   **REVOKED**: revoked</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The hosting status of the certificate. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
         * <br>
         * <p>*   **unTrustee**: not hosted</p>
         * <p>*   **trustee**: hosted</p>
         */
        @NameInMap("TrusteeStatus")
        public String trusteeStatus;

        /**
         * <p>Indicates whether the certificate is an uploaded certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
         */
        @NameInMap("Upload")
        public Boolean upload;

        /**
         * <p>The number of wildcard domain names that can be bound to the certificate. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
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
