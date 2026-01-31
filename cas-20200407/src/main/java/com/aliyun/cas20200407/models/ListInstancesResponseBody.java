// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("InstanceList")
    public java.util.List<ListInstancesResponseBodyInstanceList> instanceList;

    /**
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListInstancesResponseBody setInstanceList(java.util.List<ListInstancesResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstanceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("AutoReissue")
        public String autoReissue;

        /**
         * <strong>example:</strong>
         * <p>DigiCert</p>
         */
        @NameInMap("Brand")
        public String brand;

        /**
         * <strong>example:</strong>
         * <p>21795675-cn-hangzhou</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <strong>example:</strong>
         * <p>18541349</p>
         */
        @NameInMap("CertificateId")
        public Long certificateId;

        /**
         * <strong>example:</strong>
         * <p>cert-13216408</p>
         */
        @NameInMap("CertificateName")
        public String certificateName;

        /**
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        @NameInMap("CertificateNotAfter")
        public Long certificateNotAfter;

        /**
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        @NameInMap("CertificateRevokeTime")
        public Long certificateRevokeTime;

        /**
         * <strong>example:</strong>
         * <p>issued</p>
         */
        @NameInMap("CertificateStatus")
        public String certificateStatus;

        /**
         * <strong>example:</strong>
         * <p>DV</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FullDomainCount")
        public Integer fullDomainCount;

        /**
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        @NameInMap("InstanceEndTime")
        public Long instanceEndTime;

        /**
         * <strong>example:</strong>
         * <p>cas_dv-cn-123</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        @NameInMap("InstanceStartTime")
        public Long instanceStartTime;

        /**
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>RSA_2048</p>
         */
        @NameInMap("KeyAlgorithm")
        public String keyAlgorithm;

        /**
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        @NameInMap("OrderEndTime")
        public Long orderEndTime;

        /**
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        @NameInMap("OrderStartTime")
        public Long orderStartTime;

        /**
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("PendingResult")
        public String pendingResult;

        /**
         * <strong>example:</strong>
         * <p>ss.dv.t</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <strong>example:</strong>
         * <p>inactive</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WildcardDomainCount")
        public Integer wildcardDomainCount;

        public static ListInstancesResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstanceList self = new ListInstancesResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstanceList setAutoReissue(String autoReissue) {
            this.autoReissue = autoReissue;
            return this;
        }
        public String getAutoReissue() {
            return this.autoReissue;
        }

        public ListInstancesResponseBodyInstanceList setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public ListInstancesResponseBodyInstanceList setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public ListInstancesResponseBodyInstanceList setCertificateId(Long certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public Long getCertificateId() {
            return this.certificateId;
        }

        public ListInstancesResponseBodyInstanceList setCertificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public String getCertificateName() {
            return this.certificateName;
        }

        public ListInstancesResponseBodyInstanceList setCertificateNotAfter(Long certificateNotAfter) {
            this.certificateNotAfter = certificateNotAfter;
            return this;
        }
        public Long getCertificateNotAfter() {
            return this.certificateNotAfter;
        }

        public ListInstancesResponseBodyInstanceList setCertificateRevokeTime(Long certificateRevokeTime) {
            this.certificateRevokeTime = certificateRevokeTime;
            return this;
        }
        public Long getCertificateRevokeTime() {
            return this.certificateRevokeTime;
        }

        public ListInstancesResponseBodyInstanceList setCertificateStatus(String certificateStatus) {
            this.certificateStatus = certificateStatus;
            return this;
        }
        public String getCertificateStatus() {
            return this.certificateStatus;
        }

        public ListInstancesResponseBodyInstanceList setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public ListInstancesResponseBodyInstanceList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListInstancesResponseBodyInstanceList setFullDomainCount(Integer fullDomainCount) {
            this.fullDomainCount = fullDomainCount;
            return this;
        }
        public Integer getFullDomainCount() {
            return this.fullDomainCount;
        }

        public ListInstancesResponseBodyInstanceList setInstanceEndTime(Long instanceEndTime) {
            this.instanceEndTime = instanceEndTime;
            return this;
        }
        public Long getInstanceEndTime() {
            return this.instanceEndTime;
        }

        public ListInstancesResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstanceList setInstanceStartTime(Long instanceStartTime) {
            this.instanceStartTime = instanceStartTime;
            return this;
        }
        public Long getInstanceStartTime() {
            return this.instanceStartTime;
        }

        public ListInstancesResponseBodyInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListInstancesResponseBodyInstanceList setKeyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }
        public String getKeyAlgorithm() {
            return this.keyAlgorithm;
        }

        public ListInstancesResponseBodyInstanceList setOrderEndTime(Long orderEndTime) {
            this.orderEndTime = orderEndTime;
            return this;
        }
        public Long getOrderEndTime() {
            return this.orderEndTime;
        }

        public ListInstancesResponseBodyInstanceList setOrderStartTime(Long orderStartTime) {
            this.orderStartTime = orderStartTime;
            return this;
        }
        public Long getOrderStartTime() {
            return this.orderStartTime;
        }

        public ListInstancesResponseBodyInstanceList setPendingResult(String pendingResult) {
            this.pendingResult = pendingResult;
            return this;
        }
        public String getPendingResult() {
            return this.pendingResult;
        }

        public ListInstancesResponseBodyInstanceList setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListInstancesResponseBodyInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyInstanceList setWildcardDomainCount(Integer wildcardDomainCount) {
            this.wildcardDomainCount = wildcardDomainCount;
            return this;
        }
        public Integer getWildcardDomainCount() {
            return this.wildcardDomainCount;
        }

    }

}
