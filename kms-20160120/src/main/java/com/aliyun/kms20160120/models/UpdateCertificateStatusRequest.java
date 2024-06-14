// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateCertificateStatusRequest extends TeaModel {
    /**
     * <p>The ID of the certificate. The ID must be globally unique in Certificates Manager.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The status of the certificate. Valid values:</p>
     * <br>
     * <p>*   INACTIVE: The certificate is disabled.</p>
     * <br>
     * <p>*   ACTIVE: The certificate is enabled.</p>
     * <br>
     * <p>*   REVOKED: The certificate is revoked.</p>
     * <br>
     * <p>> If the certificate is in the REVOKED state, you can use the certificate only to verify a signature, but not to generate a signature.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
