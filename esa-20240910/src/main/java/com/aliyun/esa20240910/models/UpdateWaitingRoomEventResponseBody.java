// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWaitingRoomEventResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0195619f-eab3-4a66-ac00-ed53d913e72e</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWaitingRoomEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaitingRoomEventResponseBody self = new UpdateWaitingRoomEventResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWaitingRoomEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
