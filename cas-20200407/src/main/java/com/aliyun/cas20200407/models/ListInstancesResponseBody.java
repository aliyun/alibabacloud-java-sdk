// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The current page number in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of instances.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<ListInstancesResponseBodyInstanceList> instanceList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The total number of instances.</p>
     * 
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
         * <p>Indicates whether automatic managed renewal is enabled. Valid values:</p>
         * <ul>
         * <li>enable: enabled.</li>
         * <li>disable: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("AutoReissue")
        public String autoReissue;

        /**
         * <p>The CA brand. Valid values: WoSign, CFCA, DigiCert, GeoTrust, GlobalSign, vTrus, and Alibaba.</p>
         * 
         * <strong>example:</strong>
         * <p>DigiCert</p>
         */
        @NameInMap("Brand")
        public String brand;

        /**
         * <p>The global certificate ID in the format of certificate ID + &quot;-&quot; + site region ID. This ID is commonly used across Alibaba Cloud services.</p>
         * <ul>
         * <li>For the China site: certificate ID + &quot;-cn-hangzhou&quot;</li>
         * <li>For the China site: certificate ID + &quot;-ap-southeast-1&quot;</li>
         * </ul>
         * <p>For example, if the certificate ID is 123, the CertIdentifier on the China site is &quot;123-cn-hangzhou&quot;, and the CertIdentifier on the China site is &quot;123-ap-southeast-1&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>21795675-cn-hangzhou</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The domain name of the latest issued certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.com,<a href="http://www.abc.com">www.abc.com</a></p>
         */
        @NameInMap("CertificateDomain")
        public String certificateDomain;

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18541349</p>
         */
        @NameInMap("CertificateId")
        public Long certificateId;

        /**
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-13216408</p>
         */
        @NameInMap("CertificateName")
        public String certificateName;

        /**
         * <p>The end time of the latest certificate, in UNIX timestamp format. If no certificate has been issued, this value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        @NameInMap("CertificateNotAfter")
        public Long certificateNotAfter;

        @NameInMap("CertificateNotBefore")
        public Long certificateNotBefore;

        /**
         * <p>The revocation time of the latest certificate, in UNIX timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        @NameInMap("CertificateRevokeTime")
        public Long certificateRevokeTime;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>issued</strong>: issued.</li>
         * <li><strong>revoked</strong>: revoked.</li>
         * <li><strong>willExpire</strong>: about to expire.</li>
         * <li><strong>expired</strong>: expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>issued</p>
         */
        @NameInMap("CertificateStatus")
        public String certificateStatus;

        /**
         * <p>The type of the certificate. Valid values: DV, OV, and EV.</p>
         * 
         * <strong>example:</strong>
         * <p>DV</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>The domain name bound to the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The number of exact-match domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FullDomainCount")
        public Integer fullDomainCount;

        /**
         * <p>The expiration time of the instance, in UNIX timestamp format. If no certificate has been issued, this value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        @NameInMap("InstanceEndTime")
        public Long instanceEndTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cas_dv-cn-123</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The start time of the instance, in UNIX timestamp format. If no certificate has been issued, this value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        @NameInMap("InstanceStartTime")
        public Long instanceStartTime;

        /**
         * <p>The instance type. Valid values: BUY (official certificate) and TEST (test certificate).</p>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The certificate algorithm. Default value: RSA_2048. Valid values:</p>
         * <ul>
         * <li><strong>RSA_2048</strong></li>
         * <li><strong>RSA_3072</strong></li>
         * <li><strong>RSA_4096</strong></li>
         * <li><strong>ECC_256</strong></li>
         * <li><strong>SM2</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RSA_2048</p>
         */
        @NameInMap("KeyAlgorithm")
        public String keyAlgorithm;

        /**
         * <p>The end time of the instance purchase, in UNIX timestamp format. This value is used to determine the purchase duration of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        @NameInMap("OrderEndTime")
        public Long orderEndTime;

        /**
         * <p>The start time of the instance purchase, in UNIX timestamp format. This value is used to determine the refund time limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        @NameInMap("OrderStartTime")
        public Long orderStartTime;

        /**
         * <p>The result returned by the CA during the last certificate operation.</p>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("PendingResult")
        public String pendingResult;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The purchased instance specification.</p>
         * 
         * <strong>example:</strong>
         * <p>ss.dv.t</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>inactive</strong>: pending use.</li>
         * <li><strong>pending</strong>: under review. The latest certificate is being reviewed.</li>
         * <li><strong>willExpire</strong>: about to expire.</li>
         * <li><strong>expired</strong>: expired.</li>
         * <li><strong>refund</strong>: refunded.</li>
         * <li><strong>normal</strong>: normal.</li>
         * <li><strong>closed</strong>: closed and unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>inactive</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of cloud services to which the latest certificate is deployed.</p>
         */
        @NameInMap("UsingProductList")
        public java.util.List<String> usingProductList;

        /**
         * <p>The number of wildcard domain names.</p>
         * 
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

        public ListInstancesResponseBodyInstanceList setCertificateDomain(String certificateDomain) {
            this.certificateDomain = certificateDomain;
            return this;
        }
        public String getCertificateDomain() {
            return this.certificateDomain;
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

        public ListInstancesResponseBodyInstanceList setCertificateNotBefore(Long certificateNotBefore) {
            this.certificateNotBefore = certificateNotBefore;
            return this;
        }
        public Long getCertificateNotBefore() {
            return this.certificateNotBefore;
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

        public ListInstancesResponseBodyInstanceList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        public ListInstancesResponseBodyInstanceList setUsingProductList(java.util.List<String> usingProductList) {
            this.usingProductList = usingProductList;
            return this;
        }
        public java.util.List<String> getUsingProductList() {
            return this.usingProductList;
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
