// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregatorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAggregatorResponseBody body;

    public static UpdateAggregatorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregatorResponse self = new UpdateAggregatorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAggregatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAggregatorResponse setBody(UpdateAggregatorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAggregatorResponseBody getBody() {
        return this.body;
    }

}
