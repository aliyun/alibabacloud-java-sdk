// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListUserCertificateOrderResponseBody extends TeaModel {
    @NameInMap("CertificateOrderList")
    public java.util.List<ListUserCertificateOrderResponseBodyCertificateOrderList> certificateOrderList;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowSize")
    public Long showSize;

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
        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("AliyunOrderId")
        public Long aliyunOrderId;

        @NameInMap("BuyDate")
        public Long buyDate;

        @NameInMap("CertEndTime")
        public Long certEndTime;

        @NameInMap("CertStartTime")
        public Long certStartTime;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("DomainCount")
        public Long domainCount;

        @NameInMap("DomainType")
        public String domainType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("PartnerOrderId")
        public String partnerOrderId;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("RootBrand")
        public String rootBrand;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TrusteeStatus")
        public String trusteeStatus;

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

        public ListUserCertificateOrderResponseBodyCertificateOrderList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
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

        public ListUserCertificateOrderResponseBodyCertificateOrderList setRootBrand(String rootBrand) {
            this.rootBrand = rootBrand;
            return this;
        }
        public String getRootBrand() {
            return this.rootBrand;
        }

        public ListUserCertificateOrderResponseBodyCertificateOrderList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
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

        public ListUserCertificateOrderResponseBodyCertificateOrderList setWildDomainCount(Long wildDomainCount) {
            this.wildDomainCount = wildDomainCount;
            return this;
        }
        public Long getWildDomainCount() {
            return this.wildDomainCount;
        }

    }

}
