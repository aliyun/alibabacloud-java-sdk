// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteAckClusterConnectorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>133173B9-8010-5DF5-8B93-********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAckClusterConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAckClusterConnectorResponseBody self = new DeleteAckClusterConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAckClusterConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
