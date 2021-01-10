// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetLiveDomainCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainCertificateResponseBody self = new SetLiveDomainCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
