// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateDetailByIdResponseBody extends TeaModel {
    /**
     * <p>The content of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGINCERTIFICATE-----xxx-----END CERTIFICATE-----</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <p>The ID of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("CertId")
    public Long certId;

    /**
     * <p>The name of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>yourCertName</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The public key of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>587f6db37e3a2f01047b032b739cbe31</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnCertificateDetailByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnCertificateDetailByIdResponseBody self = new DescribeCdnCertificateDetailByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnCertificateDetailByIdResponseBody setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public DescribeCdnCertificateDetailByIdResponseBody setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public DescribeCdnCertificateDetailByIdResponseBody setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeCdnCertificateDetailByIdResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeCdnCertificateDetailByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
