// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A4EA075-CB5B-41B7-B0EB-70D339F6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDedicatedHostAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAttributeResponseBody self = new ModifyDedicatedHostAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
