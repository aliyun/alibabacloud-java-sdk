// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainCertificateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDcdnDomainCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnDomainCertificateResponseBody self = new SetDcdnDomainCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDcdnDomainCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
