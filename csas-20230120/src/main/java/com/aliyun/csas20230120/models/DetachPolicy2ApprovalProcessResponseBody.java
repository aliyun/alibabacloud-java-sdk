// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DetachPolicy2ApprovalProcessResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachPolicy2ApprovalProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicy2ApprovalProcessResponseBody self = new DetachPolicy2ApprovalProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachPolicy2ApprovalProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
