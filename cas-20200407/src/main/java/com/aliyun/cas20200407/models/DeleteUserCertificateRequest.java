// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteUserCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     */
    @NameInMap("CertId")
    public Long certId;

    public static DeleteUserCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserCertificateRequest self = new DeleteUserCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserCertificateRequest setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

}
