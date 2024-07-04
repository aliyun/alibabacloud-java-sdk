// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteStorageGatewayResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>853D6E71-E087-1557-B65C-32BFBEE5CD97</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStorageGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageGatewayResponseBody self = new DeleteStorageGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStorageGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
