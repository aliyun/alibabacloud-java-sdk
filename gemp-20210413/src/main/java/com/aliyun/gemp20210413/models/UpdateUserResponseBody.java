// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateUserResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static UpdateUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserResponseBody self = new UpdateUserResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
