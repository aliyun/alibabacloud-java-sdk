// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadUserCertificateResponseBody extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("CertId")
    public Long certId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BDB81BA2-E1F5-4D08-A2DD-4BE2BF44C90E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-upload-j2ofdb</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static UploadUserCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadUserCertificateResponseBody self = new UploadUserCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadUserCertificateResponseBody setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public UploadUserCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadUserCertificateResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
