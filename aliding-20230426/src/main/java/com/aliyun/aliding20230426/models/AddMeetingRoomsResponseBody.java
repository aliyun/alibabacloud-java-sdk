// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddMeetingRoomsResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Boolean result;

    public static AddMeetingRoomsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMeetingRoomsResponseBody self = new AddMeetingRoomsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMeetingRoomsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMeetingRoomsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
