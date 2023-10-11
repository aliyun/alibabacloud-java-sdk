// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UnsubscribeCalendarResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Boolean result;

    public static UnsubscribeCalendarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeCalendarResponseBody self = new UnsubscribeCalendarResponseBody();
        return TeaModel.build(map, self);
    }

    public UnsubscribeCalendarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnsubscribeCalendarResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
