// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RenewInstanceResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static RenewInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceResponseBody self = new RenewInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewInstanceResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public RenewInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
