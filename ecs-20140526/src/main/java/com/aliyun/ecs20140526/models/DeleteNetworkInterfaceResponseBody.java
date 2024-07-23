// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteNetworkInterfaceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F3CD6886-D8D0-4FEE-B93E-1B73239673DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInterfaceResponseBody self = new DeleteNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
