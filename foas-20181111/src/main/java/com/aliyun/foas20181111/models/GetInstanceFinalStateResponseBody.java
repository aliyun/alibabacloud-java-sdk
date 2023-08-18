// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceFinalStateResponseBody extends TeaModel {
    @NameInMap("Finalstate")
    public String finalstate;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceFinalStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceFinalStateResponseBody self = new GetInstanceFinalStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceFinalStateResponseBody setFinalstate(String finalstate) {
        this.finalstate = finalstate;
        return this;
    }
    public String getFinalstate() {
        return this.finalstate;
    }

    public GetInstanceFinalStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
