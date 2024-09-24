// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyObjectGroupOperationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB32593D************775F41D6ED84</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyObjectGroupOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyObjectGroupOperationResponseBody self = new ModifyObjectGroupOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyObjectGroupOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
