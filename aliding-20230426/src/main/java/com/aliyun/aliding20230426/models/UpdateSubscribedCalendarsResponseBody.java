// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateSubscribedCalendarsResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Boolean result;

    public static UpdateSubscribedCalendarsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscribedCalendarsResponseBody self = new UpdateSubscribedCalendarsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSubscribedCalendarsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSubscribedCalendarsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
