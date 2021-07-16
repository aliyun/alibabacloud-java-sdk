// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CancelProblemResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CancelProblemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelProblemResponseBody self = new CancelProblemResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelProblemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
