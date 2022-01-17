// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class PushMeteringDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PushMeteringDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushMeteringDataResponseBody self = new PushMeteringDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PushMeteringDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushMeteringDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
