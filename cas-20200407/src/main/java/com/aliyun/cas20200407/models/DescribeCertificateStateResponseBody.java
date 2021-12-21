// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCertificateStateResponseBody extends TeaModel {
    @NameInMap("Certificate")
    public String certificate;

    @NameInMap("Content")
    public String content;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("RecordDomain")
    public String recordDomain;

    @NameInMap("RecordType")
    public String recordType;

    @NameInMap("RecordValue")
    public String recordValue;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uri")
    public String uri;

    @NameInMap("ValidateType")
    public String validateType;

    public static DescribeCertificateStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateStateResponseBody self = new DescribeCertificateStateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateStateResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public DescribeCertificateStateResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeCertificateStateResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeCertificateStateResponseBody setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public DescribeCertificateStateResponseBody setRecordDomain(String recordDomain) {
        this.recordDomain = recordDomain;
        return this;
    }
    public String getRecordDomain() {
        return this.recordDomain;
    }

    public DescribeCertificateStateResponseBody setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public DescribeCertificateStateResponseBody setRecordValue(String recordValue) {
        this.recordValue = recordValue;
        return this;
    }
    public String getRecordValue() {
        return this.recordValue;
    }

    public DescribeCertificateStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCertificateStateResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeCertificateStateResponseBody setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public DescribeCertificateStateResponseBody setValidateType(String validateType) {
        this.validateType = validateType;
        return this;
    }
    public String getValidateType() {
        return this.validateType;
    }

}
