// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetGWSClusterPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetGWSClusterPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetGWSClusterPolicyResponseBody self = new SetGWSClusterPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetGWSClusterPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
