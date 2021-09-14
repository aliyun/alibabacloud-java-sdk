// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchDeleteScreensResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeleteScreensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteScreensResponseBody self = new BatchDeleteScreensResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteScreensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
