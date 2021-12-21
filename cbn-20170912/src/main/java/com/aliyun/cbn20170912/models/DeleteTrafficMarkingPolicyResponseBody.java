// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTrafficMarkingPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTrafficMarkingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficMarkingPolicyResponseBody self = new DeleteTrafficMarkingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficMarkingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
