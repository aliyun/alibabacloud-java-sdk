// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiGroupNetworkPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4E707B25-5119-5ACF-9D26-7D2A2762F05C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApiGroupNetworkPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupNetworkPolicyResponseBody self = new ModifyApiGroupNetworkPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupNetworkPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
