// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the certificate. It is the globally unique identifier (GUID) of the certificate in Alibaba Cloud Certificate Manager.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9a28de48-8d8b-484d-a766-dec4****</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    public static DeleteCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertificateRequest self = new DeleteCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCertificateRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

}
