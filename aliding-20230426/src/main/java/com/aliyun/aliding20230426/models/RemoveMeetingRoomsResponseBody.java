// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RemoveMeetingRoomsResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Boolean result;

    public static RemoveMeetingRoomsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveMeetingRoomsResponseBody self = new RemoveMeetingRoomsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveMeetingRoomsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveMeetingRoomsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
