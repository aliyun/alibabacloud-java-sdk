// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAreaBlockResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5AA2BD65-E289-4E91-9DD9-3E1FB2140D17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebAreaBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAreaBlockResponseBody self = new ModifyWebAreaBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebAreaBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
