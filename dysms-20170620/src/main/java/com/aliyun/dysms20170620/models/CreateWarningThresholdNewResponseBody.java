// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateWarningThresholdNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static CreateWarningThresholdNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWarningThresholdNewResponseBody self = new CreateWarningThresholdNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWarningThresholdNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWarningThresholdNewResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
