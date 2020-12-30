// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeBatchSlsDispatchStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBatchSlsDispatchStatusResponseBody body;

    public static DescribeBatchSlsDispatchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchSlsDispatchStatusResponse self = new DescribeBatchSlsDispatchStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBatchSlsDispatchStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBatchSlsDispatchStatusResponse setBody(DescribeBatchSlsDispatchStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBatchSlsDispatchStatusResponseBody getBody() {
        return this.body;
    }

}
