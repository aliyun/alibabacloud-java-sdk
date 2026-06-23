// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWaitingRoomEventResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The waiting room event ID. You can call the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWaitingRoomEvents</a> operation to obtain the waiting room event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>433277746085888</p>
     */
    @NameInMap("WaitingRoomEventId")
    public Long waitingRoomEventId;

    public static CreateWaitingRoomEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWaitingRoomEventResponseBody self = new CreateWaitingRoomEventResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWaitingRoomEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWaitingRoomEventResponseBody setWaitingRoomEventId(Long waitingRoomEventId) {
        this.waitingRoomEventId = waitingRoomEventId;
        return this;
    }
    public Long getWaitingRoomEventId() {
        return this.waitingRoomEventId;
    }

}
