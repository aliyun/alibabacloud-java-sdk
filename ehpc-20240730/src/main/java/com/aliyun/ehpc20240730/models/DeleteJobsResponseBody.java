// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DeleteJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsResponseBody self = new DeleteJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
