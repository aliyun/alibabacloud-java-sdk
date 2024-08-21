// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobCertResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDeploymentJobCertResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDeploymentJobCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentJobCertResponseBody self = new ListDeploymentJobCertResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentJobCertResponseBody setData(java.util.List<ListDeploymentJobCertResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDeploymentJobCertResponseBodyData> getData() {
        return this.data;
    }

    public ListDeploymentJobCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeploymentJobCertResponseBodyData extends TeaModel {
        /**
         * <p>The algorithm of the certificate public key.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>11174100</p>
         */
        @NameInMap("CertId")
        public Long certId;

        /**
         * <p>The instance ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-ivauto-2crxzi</p>
         */
        @NameInMap("CertInstanceId")
        public String certInstanceId;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>edkog.shop</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The type of the certificate order. Valid values:</p>
         * <ul>
         * <li><strong>upload</strong>: uploaded certificate.</li>
         * <li><strong>buy</strong>: purchased certificate.</li>
         * <li><strong>free</strong>: free certificate. This value is available only on the China site (aliyun.com).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>buy</p>
         */
        @NameInMap("CertOrderType")
        public String certOrderType;

        /**
         * <p>The type of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>DV</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The common name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>vaultwebhook.vault-webhook.svc</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>Indicates whether the certificate is hosted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsTrustee")
        public Boolean isTrustee;

        /**
         * <p>The month in which the certificate is applied for.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Month")
        public Integer month;

        /**
         * <p>The end time of the validity period of the certificate. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683625266108</p>
         */
        @NameInMap("NotAfterTime")
        public Long notAfterTime;

        /**
         * <p>The start time of the validity period of the certificate. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683625266108</p>
         */
        @NameInMap("NotBeforeTime")
        public Long notBeforeTime;

        /**
         * <p>The ID of the certificate order.</p>
         * <blockquote>
         * <p> If CertId is returned, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6127067</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The subject alternative name (SAN) extensions of the certificate.</p>
         */
        @NameInMap("Sans")
        public java.util.List<String> sans;

        /**
         * <p>The status code of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>payed</strong>: paid and pending application</li>
         * <li><strong>checking</strong>: being validated</li>
         * <li><strong>checkedFail</strong>: validation failed</li>
         * <li><strong>revoked</strong>: revoked</li>
         * <li><strong>revokeChecking</strong>: revocation request being validated</li>
         * <li><strong>issued</strong>: issued (excluding hosted certificates that are issued, certificates that are about to expire, expired certificates, and uploaded certificates)</li>
         * <li><strong>trustee</strong>: hosted and issued</li>
         * <li><strong>upload</strong>: uploaded (excluding certificates that are about to expire and expired certificates)</li>
         * <li><strong>willExpired</strong>: about to expire (including certificates issued by using the Certificate Management Service console and uploaded certificates)</li>
         * <li><strong>expired</strong>: expired (including certificates issued by using the Certificate Management Service console and uploaded certificates)</li>
         * <li><strong>validity</strong>: valid (including certificates that are not expired or revoked)</li>
         * <li><strong>refund</strong>: refunded</li>
         * <li><strong>closed</strong>: closed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>issued</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        public static ListDeploymentJobCertResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentJobCertResponseBodyData self = new ListDeploymentJobCertResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeploymentJobCertResponseBodyData setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListDeploymentJobCertResponseBodyData setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public ListDeploymentJobCertResponseBodyData setCertInstanceId(String certInstanceId) {
            this.certInstanceId = certInstanceId;
            return this;
        }
        public String getCertInstanceId() {
            return this.certInstanceId;
        }

        public ListDeploymentJobCertResponseBodyData setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public ListDeploymentJobCertResponseBodyData setCertOrderType(String certOrderType) {
            this.certOrderType = certOrderType;
            return this;
        }
        public String getCertOrderType() {
            return this.certOrderType;
        }

        public ListDeploymentJobCertResponseBodyData setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public ListDeploymentJobCertResponseBodyData setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListDeploymentJobCertResponseBodyData setIsTrustee(Boolean isTrustee) {
            this.isTrustee = isTrustee;
            return this;
        }
        public Boolean getIsTrustee() {
            return this.isTrustee;
        }

        public ListDeploymentJobCertResponseBodyData setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public ListDeploymentJobCertResponseBodyData setNotAfterTime(Long notAfterTime) {
            this.notAfterTime = notAfterTime;
            return this;
        }
        public Long getNotAfterTime() {
            return this.notAfterTime;
        }

        public ListDeploymentJobCertResponseBodyData setNotBeforeTime(Long notBeforeTime) {
            this.notBeforeTime = notBeforeTime;
            return this;
        }
        public Long getNotBeforeTime() {
            return this.notBeforeTime;
        }

        public ListDeploymentJobCertResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListDeploymentJobCertResponseBodyData setSans(java.util.List<String> sans) {
            this.sans = sans;
            return this;
        }
        public java.util.List<String> getSans() {
            return this.sans;
        }

        public ListDeploymentJobCertResponseBodyData setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

    }

}
