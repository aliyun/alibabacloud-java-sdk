// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ResetAntChainUserCertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3EB828D1-1E9D-4EC2-A002-139FE998D674</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
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
