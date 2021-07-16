// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteProblemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemResponseBody self = new DeleteProblemResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProblemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
