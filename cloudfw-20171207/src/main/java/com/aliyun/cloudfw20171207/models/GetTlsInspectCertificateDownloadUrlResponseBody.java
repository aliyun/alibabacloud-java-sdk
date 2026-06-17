// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class GetTlsInspectCertificateDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>The ID of the CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1f07c104-99ed-6b9a-b0bb-2938c9b8****</p>
     */
    @NameInMap("CaCertId")
    public String caCertId;

    /**
     * <p>The download path of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cfw-tls-inspect-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/tls_cert%2F2025-08-13%2F1850">https://cfw-tls-inspect-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/tls_cert%2F2025-08-13%2F1850</a>****</p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6-0DE4-4797-A1E8-******h4j6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTlsInspectCertificateDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTlsInspectCertificateDownloadUrlResponseBody self = new GetTlsInspectCertificateDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTlsInspectCertificateDownloadUrlResponseBody setCaCertId(String caCertId) {
        this.caCertId = caCertId;
        return this;
    }
    public String getCaCertId() {
        return this.caCertId;
    }

    public GetTlsInspectCertificateDownloadUrlResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public GetTlsInspectCertificateDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
