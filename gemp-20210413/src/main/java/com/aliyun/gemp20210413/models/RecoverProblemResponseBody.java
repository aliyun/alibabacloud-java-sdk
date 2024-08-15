// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RecoverProblemResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EBC39DEF-C95B-46F8-9AE3-204F0B0A706D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RecoverProblemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoverProblemResponseBody self = new RecoverProblemResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoverProblemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
