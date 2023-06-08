// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainSSLCertificateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetCdnDomainSSLCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainSSLCertificateResponseBody self = new SetCdnDomainSSLCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainSSLCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
