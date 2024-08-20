// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnCertificateDetailResponseBody extends TeaModel {
    /**
     * <p>The content of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----xxx-----END CERTIFICATE-----</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <p>The ID of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CertId")
    public Long certId;

    /**
     * <p>The name of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The key of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>ak1htyxxxx</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C7C69682-7F88-40DD-A198-10D0309E439B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnCertificateDetailResponseBody self = new DescribeDcdnCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnCertificateDetailResponseBody setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public DescribeDcdnCertificateDetailResponseBody setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public DescribeDcdnCertificateDetailResponseBody setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeDcdnCertificateDetailResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDcdnCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
