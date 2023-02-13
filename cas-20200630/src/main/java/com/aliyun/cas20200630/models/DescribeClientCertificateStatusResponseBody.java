// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateStatusResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the status information about the certificates.</p>
     */
    @NameInMap("CertificateStatus")
    public java.util.List<DescribeClientCertificateStatusResponseBodyCertificateStatus> certificateStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClientCertificateStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateStatusResponseBody self = new DescribeClientCertificateStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateStatusResponseBody setCertificateStatus(java.util.List<DescribeClientCertificateStatusResponseBodyCertificateStatus> certificateStatus) {
        this.certificateStatus = certificateStatus;
        return this;
    }
    public java.util.List<DescribeClientCertificateStatusResponseBodyCertificateStatus> getCertificateStatus() {
        return this.certificateStatus;
    }

    public DescribeClientCertificateStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClientCertificateStatusResponseBodyCertificateStatus extends TeaModel {
        /**
         * <p>The date on which the certificate was revoked.</p>
         * <br>
         * <p>>  This parameter is returned only when the value of the **Status** parameter is **revoked**. The value revoked indicates that the certificate is revoked.</p>
         */
        @NameInMap("RevokeTime")
        public Long revokeTime;

        /**
         * <p>The serial number of the certificate.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <br>
         * <p>*   **good**: The certificate is not revoked.</p>
         * <p>*   **revoked**: The certificate is revoked.</p>
         * <p>*   **unknown**: The server cannot determine the status of the certificate.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeClientCertificateStatusResponseBodyCertificateStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientCertificateStatusResponseBodyCertificateStatus self = new DescribeClientCertificateStatusResponseBodyCertificateStatus();
            return TeaModel.build(map, self);
        }

        public DescribeClientCertificateStatusResponseBodyCertificateStatus setRevokeTime(Long revokeTime) {
            this.revokeTime = revokeTime;
            return this;
        }
        public Long getRevokeTime() {
            return this.revokeTime;
        }

        public DescribeClientCertificateStatusResponseBodyCertificateStatus setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeClientCertificateStatusResponseBodyCertificateStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
