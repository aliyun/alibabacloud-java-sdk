// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class OperateFeeOrderResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static OperateFeeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateFeeOrderResponseBody self = new OperateFeeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateFeeOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OperateFeeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
