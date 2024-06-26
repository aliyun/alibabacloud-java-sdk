// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyAntChainCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static ApplyAntChainCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntChainCertificateResponseBody self = new ApplyAntChainCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyAntChainCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyAntChainCertificateResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
