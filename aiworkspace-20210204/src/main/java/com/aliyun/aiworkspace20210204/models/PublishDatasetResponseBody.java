// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class PublishDatasetResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static PublishDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishDatasetResponseBody self = new PublishDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
