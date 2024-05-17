// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteStreamingJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStreamingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamingJobResponseBody self = new DeleteStreamingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStreamingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
