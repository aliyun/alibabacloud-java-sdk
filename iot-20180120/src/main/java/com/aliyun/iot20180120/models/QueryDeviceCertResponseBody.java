// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceCertResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("DeviceCertInfo")
    public QueryDeviceCertResponseBodyDeviceCertInfo deviceCertInfo;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>636217374433****</p>
         */
        @NameInMap("CertSN")
        public String certSN;

        /**
         * <strong>example:</strong>
         * <p>tXHf4ezGEHcwdyMwoCDHGBmk9avi****</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <strong>example:</strong>
         * <p>CqXL5h5ysRTA4NxjABjj0010fa****</p>
         */
        @NameInMap("PrivateKey")
        public String privateKey;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
