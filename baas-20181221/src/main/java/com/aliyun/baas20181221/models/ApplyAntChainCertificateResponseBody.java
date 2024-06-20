// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ApplyAntChainCertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D3FB9E67-0E31-4B8B-8895-3660CCE8CA62</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
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
