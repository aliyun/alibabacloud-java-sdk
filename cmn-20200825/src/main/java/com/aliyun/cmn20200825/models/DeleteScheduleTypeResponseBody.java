// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteScheduleTypeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScheduleTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleTypeResponseBody self = new DeleteScheduleTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
