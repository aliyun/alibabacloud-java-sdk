// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static ResetCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetCertificateResponseBody self = new ResetCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetCertificateResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
