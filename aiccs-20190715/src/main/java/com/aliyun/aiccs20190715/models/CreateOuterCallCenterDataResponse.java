// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class CreateOuterCallCenterDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOuterCallCenterDataResponseBody body;

    public static CreateOuterCallCenterDataResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOuterCallCenterDataResponse self = new CreateOuterCallCenterDataResponse();
        return TeaModel.build(map, self);
    }

    public CreateOuterCallCenterDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOuterCallCenterDataResponse setBody(CreateOuterCallCenterDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOuterCallCenterDataResponseBody getBody() {
        return this.body;
    }

}
