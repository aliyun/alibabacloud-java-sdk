// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateResourceInventoryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E1225EEA-B5F8-538F-8E37-A943986B6290</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateResourceInventoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateResourceInventoryResponseBody self = new GenerateResourceInventoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateResourceInventoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
