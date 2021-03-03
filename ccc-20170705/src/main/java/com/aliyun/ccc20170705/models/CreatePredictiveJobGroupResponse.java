// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreatePredictiveJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePredictiveJobGroupResponseBody body;

    public static CreatePredictiveJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePredictiveJobGroupResponse self = new CreatePredictiveJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreatePredictiveJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePredictiveJobGroupResponse setBody(CreatePredictiveJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePredictiveJobGroupResponseBody getBody() {
        return this.body;
    }

}
