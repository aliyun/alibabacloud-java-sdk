// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ReplayProblemResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B81E84B5-8FD1-45F3-969A-B5067AADCFFF</p>
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
