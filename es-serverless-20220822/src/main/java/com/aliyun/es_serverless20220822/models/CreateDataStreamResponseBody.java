// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class CreateDataStreamResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static CreateDataStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataStreamResponseBody self = new CreateDataStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
