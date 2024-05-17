// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteStreamingDataSourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStreamingDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamingDataSourceResponseBody self = new DeleteStreamingDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStreamingDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
