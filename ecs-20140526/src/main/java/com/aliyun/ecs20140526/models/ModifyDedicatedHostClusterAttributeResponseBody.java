// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>11B55F58-D3A4-4A9B-9596-342420D02FF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDedicatedHostClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostClusterAttributeResponseBody self = new ModifyDedicatedHostClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
