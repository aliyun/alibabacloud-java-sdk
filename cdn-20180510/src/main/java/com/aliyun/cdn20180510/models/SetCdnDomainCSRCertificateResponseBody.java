// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainCSRCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetCdnDomainCSRCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainCSRCertificateResponseBody self = new SetCdnDomainCSRCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainCSRCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
