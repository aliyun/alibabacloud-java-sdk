// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ReplayProblemResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ReplayProblemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplayProblemResponseBody self = new ReplayProblemResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplayProblemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
