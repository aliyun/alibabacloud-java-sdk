// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public String result;

    public static CreateMeetingRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingRoomResponseBody self = new CreateMeetingRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMeetingRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMeetingRoomResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
