// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteServiceGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteServiceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceGroupResponseBody self = new DeleteServiceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
