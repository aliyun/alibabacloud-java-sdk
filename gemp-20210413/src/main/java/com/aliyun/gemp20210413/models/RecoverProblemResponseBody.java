// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RecoverProblemResponseBody extends TeaModel {
    // Id of the request
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
