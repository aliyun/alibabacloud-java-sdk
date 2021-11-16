// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteServiceGroupUserResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteServiceGroupUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceGroupUserResponseBody self = new DeleteServiceGroupUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceGroupUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
