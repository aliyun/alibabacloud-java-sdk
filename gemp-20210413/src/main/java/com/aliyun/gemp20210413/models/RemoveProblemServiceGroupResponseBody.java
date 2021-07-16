// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RemoveProblemServiceGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static RemoveProblemServiceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveProblemServiceGroupResponseBody self = new RemoveProblemServiceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveProblemServiceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
