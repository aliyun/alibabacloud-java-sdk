// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class PutEvaluationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static PutEvaluationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutEvaluationsResponseBody self = new PutEvaluationsResponseBody();
        return TeaModel.build(map, self);
    }

    public PutEvaluationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutEvaluationsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
