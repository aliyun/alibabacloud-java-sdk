// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateUserGuideStatusResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateUserGuideStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGuideStatusResponseBody self = new UpdateUserGuideStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserGuideStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
