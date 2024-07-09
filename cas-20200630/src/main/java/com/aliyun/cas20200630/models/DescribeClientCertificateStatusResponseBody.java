// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateStatusResponseBody extends TeaModel {
    @NameInMap("CertificateStatus")
    public java.util.List<DescribeClientCertificateStatusResponseBodyCertificateStatus> certificateStatus;

    /**
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
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
         * <strong>example:</strong>
         * <p>2021-01-01T00:00Z</p>
         */
        @NameInMap("RevokeTime")
        public Long revokeTime;

        /**
         * <strong>example:</strong>
         * <p>b67e53ebcea9b77d65b0c3236646d715****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <strong>example:</strong>
         * <p>good</p>
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
