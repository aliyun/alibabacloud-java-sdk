// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateStatusForSerialNumberResponseBody extends TeaModel {
    @NameInMap("CertificateStatus")
    public java.util.List<DescribeClientCertificateStatusForSerialNumberResponseBodyCertificateStatus> certificateStatus;

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
        @NameInMap("RevokeTime")
        public Long revokeTime;

        @NameInMap("SerialNumber")
        public String serialNumber;

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
