// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceCertResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DeviceCertInfo")
    public QueryDeviceCertResponseBodyDeviceCertInfo deviceCertInfo;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceCertResponseBody self = new QueryDeviceCertResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceCertResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceCertResponseBody setDeviceCertInfo(QueryDeviceCertResponseBodyDeviceCertInfo deviceCertInfo) {
        this.deviceCertInfo = deviceCertInfo;
        return this;
    }
    public QueryDeviceCertResponseBodyDeviceCertInfo getDeviceCertInfo() {
        return this.deviceCertInfo;
    }

    public QueryDeviceCertResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceCertResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceCertResponseBodyDeviceCertInfo extends TeaModel {
        @NameInMap("CertSN")
        public String certSN;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("PrivateKey")
        public String privateKey;

        @NameInMap("Status")
        public Integer status;

        public static QueryDeviceCertResponseBodyDeviceCertInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceCertResponseBodyDeviceCertInfo self = new QueryDeviceCertResponseBodyDeviceCertInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceCertResponseBodyDeviceCertInfo setCertSN(String certSN) {
            this.certSN = certSN;
            return this;
        }
        public String getCertSN() {
            return this.certSN;
        }

        public QueryDeviceCertResponseBodyDeviceCertInfo setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public QueryDeviceCertResponseBodyDeviceCertInfo setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

        public QueryDeviceCertResponseBodyDeviceCertInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
