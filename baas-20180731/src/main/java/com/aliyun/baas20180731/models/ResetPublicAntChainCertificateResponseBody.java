// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetPublicAntChainCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static ResetPublicAntChainCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetPublicAntChainCertificateResponseBody self = new ResetPublicAntChainCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetPublicAntChainCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetPublicAntChainCertificateResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
