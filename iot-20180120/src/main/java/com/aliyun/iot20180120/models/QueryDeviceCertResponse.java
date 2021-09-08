// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceCertResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("DeviceCertInfo")
    @Validation(required = true)
    public QueryDeviceCertResponseDeviceCertInfo deviceCertInfo;

    public static QueryDeviceCertResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceCertResponse self = new QueryDeviceCertResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceCertResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceCertResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceCertResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceCertResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceCertResponse setDeviceCertInfo(QueryDeviceCertResponseDeviceCertInfo deviceCertInfo) {
        this.deviceCertInfo = deviceCertInfo;
        return this;
    }
    public QueryDeviceCertResponseDeviceCertInfo getDeviceCertInfo() {
        return this.deviceCertInfo;
    }

    public static class QueryDeviceCertResponseDeviceCertInfo extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Certificate")
        @Validation(required = true)
        public String certificate;

        @NameInMap("PrivateKey")
        @Validation(required = true)
        public String privateKey;

        @NameInMap("CertSN")
        @Validation(required = true)
        public String certSN;

        public static QueryDeviceCertResponseDeviceCertInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceCertResponseDeviceCertInfo self = new QueryDeviceCertResponseDeviceCertInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceCertResponseDeviceCertInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryDeviceCertResponseDeviceCertInfo setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public QueryDeviceCertResponseDeviceCertInfo setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

        public QueryDeviceCertResponseDeviceCertInfo setCertSN(String certSN) {
            this.certSN = certSN;
            return this;
        }
        public String getCertSN() {
            return this.certSN;
        }

    }

}
