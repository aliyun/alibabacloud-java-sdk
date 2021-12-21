// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTrafficMarkingPolicyAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTrafficMarkingPolicyAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficMarkingPolicyAttributeResponseBody self = new UpdateTrafficMarkingPolicyAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficMarkingPolicyAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
