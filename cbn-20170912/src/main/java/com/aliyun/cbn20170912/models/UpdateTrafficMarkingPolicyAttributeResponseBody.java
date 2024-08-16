// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTrafficMarkingPolicyAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>60BB11B2-7BF4-54DC-BCC9-F706E1EB02AC</p>
     */
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
