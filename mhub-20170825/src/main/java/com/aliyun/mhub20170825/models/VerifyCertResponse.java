// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class VerifyCertResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ParseMessage")
    @Validation(required = true)
    public String parseMessage;

    @NameInMap("CertInfo")
    @Validation(required = true)
    public VerifyCertResponseCertInfo certInfo;

    public static VerifyCertResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyCertResponse self = new VerifyCertResponse();
        return TeaModel.build(map, self);
    }

    public VerifyCertResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyCertResponse setParseMessage(String parseMessage) {
        this.parseMessage = parseMessage;
        return this;
    }
    public String getParseMessage() {
        return this.parseMessage;
    }

    public VerifyCertResponse setCertInfo(VerifyCertResponseCertInfo certInfo) {
        this.certInfo = certInfo;
        return this;
    }
    public VerifyCertResponseCertInfo getCertInfo() {
        return this.certInfo;
    }

    public static class VerifyCertResponseCertInfo extends TeaModel {
        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("CertType")
        @Validation(required = true)
        public String certType;

        @NameInMap("CertMode")
        @Validation(required = true)
        public String certMode;

        @NameInMap("ExpirationDate")
        @Validation(required = true)
        public String expirationDate;

        @NameInMap("GenerateDate")
        @Validation(required = true)
        public String generateDate;

        public static VerifyCertResponseCertInfo build(java.util.Map<String, ?> map) throws Exception {
            VerifyCertResponseCertInfo self = new VerifyCertResponseCertInfo();
            return TeaModel.build(map, self);
        }

        public VerifyCertResponseCertInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public VerifyCertResponseCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public VerifyCertResponseCertInfo setCertMode(String certMode) {
            this.certMode = certMode;
            return this;
        }
        public String getCertMode() {
            return this.certMode;
        }

        public VerifyCertResponseCertInfo setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public VerifyCertResponseCertInfo setGenerateDate(String generateDate) {
            this.generateDate = generateDate;
            return this;
        }
        public String getGenerateDate() {
            return this.generateDate;
        }

    }

}
