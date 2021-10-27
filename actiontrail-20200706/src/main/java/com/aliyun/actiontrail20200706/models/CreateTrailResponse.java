// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateTrailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrailResponseBody body;

    public static CreateTrailResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrailResponse self = new CreateTrailResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrailResponse setBody(CreateTrailResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrailResponseBody getBody() {
        return this.body;
    }

}
