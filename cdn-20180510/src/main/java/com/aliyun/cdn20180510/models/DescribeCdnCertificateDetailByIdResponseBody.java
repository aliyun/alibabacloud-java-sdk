// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateDetailByIdResponseBody extends TeaModel {
    /**
     * <p>The content of the certificate.</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <p>The ID of the certificate.</p>
     */
    @NameInMap("CertId")
    public Long certId;

    /**
     * <p>The name of the certificate.</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The public key of the certificate.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The ID of the request.</p>
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
