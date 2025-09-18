// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteTransportLayerApplicationResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90510C29-1E40-5A11-93F1-B9F5EDF57EE1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransportLayerApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransportLayerApplicationResponseBody self = new DeleteTransportLayerApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransportLayerApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
