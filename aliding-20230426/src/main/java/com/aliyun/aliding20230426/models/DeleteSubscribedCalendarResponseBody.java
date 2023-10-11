// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteSubscribedCalendarResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteSubscribedCalendarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscribedCalendarResponseBody self = new DeleteSubscribedCalendarResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSubscribedCalendarResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public DeleteSubscribedCalendarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
