// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteVirtualBridgeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7E4322D-D679-5ACB-A909-490D2F0E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVirtualBridgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualBridgeResponseBody self = new DeleteVirtualBridgeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualBridgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
