// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class GetTlsInspectCertificateDownloadUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C3E91391-16CD-1BFC-A133-******D429</p>
     */
    @NameInMap("CaCertId")
    public String caCertId;

    public static GetTlsInspectCertificateDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTlsInspectCertificateDownloadUrlRequest self = new GetTlsInspectCertificateDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetTlsInspectCertificateDownloadUrlRequest setCaCertId(String caCertId) {
        this.caCertId = caCertId;
        return this;
    }
    public String getCaCertId() {
        return this.caCertId;
    }

}
