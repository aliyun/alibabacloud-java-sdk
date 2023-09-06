// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMeetingRoomResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateMeetingRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeetingRoomResponseBody self = new UpdateMeetingRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMeetingRoomResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public UpdateMeetingRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
