// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateRemediationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAggregateRemediationResponseBody body;

    public static UpdateAggregateRemediationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateRemediationResponse self = new UpdateAggregateRemediationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateRemediationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAggregateRemediationResponse setBody(UpdateAggregateRemediationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAggregateRemediationResponseBody getBody() {
        return this.body;
    }

}
