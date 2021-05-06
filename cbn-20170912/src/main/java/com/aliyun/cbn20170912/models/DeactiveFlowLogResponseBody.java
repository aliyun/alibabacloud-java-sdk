// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeactiveFlowLogResponseBody extends TeaModel {
    @NameInMap("Success")
    public String success;

    @NameInMap("RequestId")
    public String requestId;

    public static DeactiveFlowLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeactiveFlowLogResponseBody self = new DeactiveFlowLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DeactiveFlowLogResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DeactiveFlowLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
