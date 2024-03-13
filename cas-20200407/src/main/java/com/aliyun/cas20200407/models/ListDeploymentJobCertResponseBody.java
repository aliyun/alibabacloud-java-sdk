// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobCertResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListDeploymentJobCertResponseBodyData> data;

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
        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("CertId")
        public Long certId;

        @NameInMap("CertInstanceId")
        public String certInstanceId;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CertOrderType")
        public String certOrderType;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("IsTrustee")
        public Boolean isTrustee;

        @NameInMap("Month")
        public Integer month;

        @NameInMap("NotAfterTime")
        public Long notAfterTime;

        @NameInMap("NotBeforeTime")
        public Long notBeforeTime;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("Sans")
        public java.util.List<String> sans;

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
