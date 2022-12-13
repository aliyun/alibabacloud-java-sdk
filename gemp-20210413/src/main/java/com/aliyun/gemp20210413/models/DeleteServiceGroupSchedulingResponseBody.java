// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteServiceGroupSchedulingResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeleteServiceGroupSchedulingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceGroupSchedulingResponseBody self = new DeleteServiceGroupSchedulingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceGroupSchedulingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
