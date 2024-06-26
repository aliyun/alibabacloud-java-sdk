// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetAntChainUserCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static ResetAntChainUserCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAntChainUserCertificateResponseBody self = new ResetAntChainUserCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAntChainUserCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetAntChainUserCertificateResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
