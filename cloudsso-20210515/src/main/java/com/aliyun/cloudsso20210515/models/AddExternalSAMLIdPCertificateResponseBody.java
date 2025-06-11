// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddExternalSAMLIdPCertificateResponseBody extends TeaModel {
    /**
     * <p>The ID of the SAML signing certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>idp-c-00wk2fb4foracls0****</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12B3E332-DD16-515B-B695-39BA233AA172</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddExternalSAMLIdPCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddExternalSAMLIdPCertificateResponseBody self = new AddExternalSAMLIdPCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddExternalSAMLIdPCertificateResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public AddExternalSAMLIdPCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
