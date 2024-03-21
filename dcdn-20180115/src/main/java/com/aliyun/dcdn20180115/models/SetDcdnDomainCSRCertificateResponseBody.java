// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainCSRCertificateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDcdnDomainCSRCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnDomainCSRCertificateResponseBody self = new SetDcdnDomainCSRCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDcdnDomainCSRCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
