// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A4EA075-CB5B-41B7-B0EB-70D339F6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDedicatedHostAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAutoRenewAttributeResponseBody self = new ModifyDedicatedHostAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
