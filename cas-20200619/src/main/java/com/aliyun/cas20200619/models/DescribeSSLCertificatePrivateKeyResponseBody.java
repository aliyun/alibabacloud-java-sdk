// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificatePrivateKeyResponseBody extends TeaModel {
    @NameInMap("EncryptPrivateKey")
    public String encryptPrivateKey;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignPrivateKey")
    public String signPrivateKey;

    @NameInMap("X509PrivateKey")
    public String x509PrivateKey;

    public static DescribeSSLCertificatePrivateKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificatePrivateKeyResponseBody self = new DescribeSSLCertificatePrivateKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificatePrivateKeyResponseBody setEncryptPrivateKey(String encryptPrivateKey) {
        this.encryptPrivateKey = encryptPrivateKey;
        return this;
    }
    public String getEncryptPrivateKey() {
        return this.encryptPrivateKey;
    }

    public DescribeSSLCertificatePrivateKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSSLCertificatePrivateKeyResponseBody setSignPrivateKey(String signPrivateKey) {
        this.signPrivateKey = signPrivateKey;
        return this;
    }
    public String getSignPrivateKey() {
        return this.signPrivateKey;
    }

    public DescribeSSLCertificatePrivateKeyResponseBody setX509PrivateKey(String x509PrivateKey) {
        this.x509PrivateKey = x509PrivateKey;
        return this;
    }
    public String getX509PrivateKey() {
        return this.x509PrivateKey;
    }

}
