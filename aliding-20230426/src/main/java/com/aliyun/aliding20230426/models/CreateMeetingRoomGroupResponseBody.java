// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomGroupResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Long result;

    public static CreateMeetingRoomGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingRoomGroupResponseBody self = new CreateMeetingRoomGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMeetingRoomGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMeetingRoomGroupResponseBody setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
