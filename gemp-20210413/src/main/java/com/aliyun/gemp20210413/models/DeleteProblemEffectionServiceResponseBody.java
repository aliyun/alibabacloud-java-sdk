// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemEffectionServiceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteProblemEffectionServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemEffectionServiceResponseBody self = new DeleteProblemEffectionServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProblemEffectionServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
