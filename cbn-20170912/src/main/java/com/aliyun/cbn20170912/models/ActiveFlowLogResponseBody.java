// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ActiveFlowLogResponseBody extends TeaModel {
    @NameInMap("Success")
    public String success;

    @NameInMap("RequestId")
    public String requestId;

    public static ActiveFlowLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActiveFlowLogResponseBody self = new ActiveFlowLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ActiveFlowLogResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ActiveFlowLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
