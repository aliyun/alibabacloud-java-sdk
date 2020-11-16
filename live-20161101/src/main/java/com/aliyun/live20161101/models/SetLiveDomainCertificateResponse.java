// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainCertificateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetLiveDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainCertificateResponse self = new SetLiveDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainCertificateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
