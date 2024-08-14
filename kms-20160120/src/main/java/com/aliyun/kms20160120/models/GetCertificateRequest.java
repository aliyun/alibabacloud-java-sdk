// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the certificate. It is the globally unique identifier (GUID) of the certificate in Certificates Manager.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9a28de48-8d8b-484d-a766-dec4****</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    public static GetCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateRequest self = new GetCertificateRequest();
        return TeaModel.build(map, self);
    }

    public GetCertificateRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

}
