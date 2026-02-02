// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyAICInstanceTypeResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F590DD6C-B78B-571B-8FE9-B6ECEED9BE3C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAICInstanceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAICInstanceTypeResponseBody self = new ModifyAICInstanceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAICInstanceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
