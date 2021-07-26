// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateScheduleTypeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateScheduleTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleTypeResponseBody self = new UpdateScheduleTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
