// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PrecheckMyCatEvaluateResponseBody extends TeaModel {
    @NameInMap("Data")
    public Long data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PrecheckMyCatEvaluateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrecheckMyCatEvaluateResponseBody self = new PrecheckMyCatEvaluateResponseBody();
        return TeaModel.build(map, self);
    }

    public PrecheckMyCatEvaluateResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public PrecheckMyCatEvaluateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrecheckMyCatEvaluateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
