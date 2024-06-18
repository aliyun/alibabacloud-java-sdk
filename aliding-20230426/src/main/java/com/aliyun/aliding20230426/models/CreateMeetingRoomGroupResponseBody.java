// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomGroupResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>172</p>
     */
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
