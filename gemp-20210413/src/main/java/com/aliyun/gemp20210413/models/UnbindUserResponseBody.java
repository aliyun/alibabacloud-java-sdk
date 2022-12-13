// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UnbindUserResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static UnbindUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindUserResponseBody self = new UnbindUserResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
