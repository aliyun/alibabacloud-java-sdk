// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>c26f36de-1ec8-496a-a828-880676c5ef81</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProblemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemResponseBody self = new UpdateProblemResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProblemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
