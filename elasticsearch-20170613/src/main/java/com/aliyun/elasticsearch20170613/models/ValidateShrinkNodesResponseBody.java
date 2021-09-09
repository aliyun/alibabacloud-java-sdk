// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateShrinkNodesResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static ValidateShrinkNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateShrinkNodesResponseBody self = new ValidateShrinkNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateShrinkNodesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public ValidateShrinkNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
