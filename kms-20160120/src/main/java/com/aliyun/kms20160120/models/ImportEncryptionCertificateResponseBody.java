// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ImportEncryptionCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("Arn")
    public String arn;

    public static ImportEncryptionCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportEncryptionCertificateResponseBody self = new ImportEncryptionCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportEncryptionCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportEncryptionCertificateResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public ImportEncryptionCertificateResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

}
