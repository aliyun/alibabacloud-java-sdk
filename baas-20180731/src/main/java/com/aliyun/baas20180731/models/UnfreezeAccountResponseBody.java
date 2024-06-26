// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UnfreezeAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static UnfreezeAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeAccountResponseBody self = new UnfreezeAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public UnfreezeAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnfreezeAccountResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
