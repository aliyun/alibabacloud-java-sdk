// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDedicatedBlockStorageClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDedicatedBlockStorageClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedBlockStorageClusterAttributeResponseBody self = new ModifyDedicatedBlockStorageClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedBlockStorageClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
