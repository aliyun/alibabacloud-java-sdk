// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ConfirmDisburseResult extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public String result;

    public static ConfirmDisburseResult build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDisburseResult self = new ConfirmDisburseResult();
        return TeaModel.build(map, self);
    }

    public ConfirmDisburseResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmDisburseResult setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
