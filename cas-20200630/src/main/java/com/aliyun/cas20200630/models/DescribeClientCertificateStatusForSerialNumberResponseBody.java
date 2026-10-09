// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateStatusForSerialNumberResponseBody extends TeaModel {
    /**
     * <p>The certificate status details.</p>
     */
    @NameInMap("CertificateStatus")
    public java.util.List<DescribeClientCertificateStatusForSerialNumberResponseBodyCertificateStatus> certificateStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClientCertificateStatusForSerialNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateStatusForSerialNumberResponseBody self = new DescribeClientCertificateStatusForSerialNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateStatusForSerialNumberResponseBody setCertificateStatus(java.util.List<DescribeClientCertificateStatusForSerialNumberResponseBodyCertificateStatus> certificateStatus) {
        this.certificateStatus = certificateStatus;
        return this;
    }
    public java.util.List<DescribeClientCertificateStatusForSerialNumberResponseBodyCertificateStatus> getCertificateStatus() {
        return this.certificateStatus;
    }

    public DescribeClientCertificateStatusForSerialNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClientCertificateStatusForSerialNumberResponseBodyCertificateStatus extends TeaModel {
        /**
         * <p>The date when the certificate was revoked. This value is a UNIX timestamp in milliseconds.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Status</strong> is <strong>revoked</strong> (indicating that the certificate has been revoked).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1787539908871</p>
         */
        @NameInMap("RevokeTime")
        public Long revokeTime;

        /**
         * <p>The serial number of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>b67e53ebcea9b77d65b0c3236646d715****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The current status of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>good</strong>: The certificate has not been revoked.</li>
         * <li><strong>revoked</strong>: The certificate has been revoked.</li>
         * <li><strong>unknown</strong>: The server cannot determine the status of the certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>good</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeClientCertificateStatusForSerialNumberResponseBodyCertificateStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientCertificateStatusForSerialNumberResponseBodyCertificateStatus self = new DescribeClientCertificateStatusForSerialNumberResponseBodyCertificateStatus();
            return TeaModel.build(map, self);
        }

        public DescribeClientCertificateStatusForSerialNumberResponseBodyCertificateStatus setRevokeTime(Long revokeTime) {
            this.revokeTime = revokeTime;
            return this;
        }
        public Long getRevokeTime() {
            return this.revokeTime;
        }

        public DescribeClientCertificateStatusForSerialNumberResponseBodyCertificateStatus setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeClientCertificateStatusForSerialNumberResponseBodyCertificateStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
