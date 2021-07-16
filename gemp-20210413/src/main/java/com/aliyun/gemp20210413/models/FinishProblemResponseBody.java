// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class FinishProblemResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static FinishProblemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FinishProblemResponseBody self = new FinishProblemResponseBody();
        return TeaModel.build(map, self);
    }

    public FinishProblemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
