// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateCertificateStatusRequest extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("Status")
    public String status;

    public static UpdateCertificateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCertificateStatusRequest self = new UpdateCertificateStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCertificateStatusRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public UpdateCertificateStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
