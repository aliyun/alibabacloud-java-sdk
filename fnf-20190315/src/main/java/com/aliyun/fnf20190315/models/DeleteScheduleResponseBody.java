// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DeleteScheduleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleResponseBody self = new DeleteScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
