// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupSchedulingResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateServiceGroupSchedulingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceGroupSchedulingResponseBody self = new UpdateServiceGroupSchedulingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceGroupSchedulingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
