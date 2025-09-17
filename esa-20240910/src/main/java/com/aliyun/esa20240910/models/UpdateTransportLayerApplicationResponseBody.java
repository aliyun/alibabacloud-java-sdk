// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateTransportLayerApplicationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9e5448c7-edaf-49aa-9887-0fcd0832306c</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTransportLayerApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransportLayerApplicationResponseBody self = new UpdateTransportLayerApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTransportLayerApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
