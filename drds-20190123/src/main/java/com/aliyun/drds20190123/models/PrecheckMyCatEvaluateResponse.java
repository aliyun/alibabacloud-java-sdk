// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PrecheckMyCatEvaluateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public Long data;

    public static PrecheckMyCatEvaluateResponse build(java.util.Map<String, ?> map) throws Exception {
        PrecheckMyCatEvaluateResponse self = new PrecheckMyCatEvaluateResponse();
        return TeaModel.build(map, self);
    }

    public PrecheckMyCatEvaluateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrecheckMyCatEvaluateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PrecheckMyCatEvaluateResponse setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
