// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnCertificateSigningRequestResponseBody extends TeaModel {
    /**
     * <p>The Common Name of the certificate.</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The content of the CSR file.</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The MD5 hash value of the certificate public key.</p>
     */
    @NameInMap("PubMd5")
    public String pubMd5;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCdnCertificateSigningRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnCertificateSigningRequestResponseBody self = new CreateCdnCertificateSigningRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCdnCertificateSigningRequestResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateCdnCertificateSigningRequestResponseBody setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateCdnCertificateSigningRequestResponseBody setPubMd5(String pubMd5) {
        this.pubMd5 = pubMd5;
        return this;
    }
    public String getPubMd5() {
        return this.pubMd5;
    }

    public CreateCdnCertificateSigningRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
