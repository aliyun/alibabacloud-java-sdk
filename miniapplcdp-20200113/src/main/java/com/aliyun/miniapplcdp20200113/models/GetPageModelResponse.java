// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetPageModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPageModelResponseBody body;

    public static GetPageModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPageModelResponse self = new GetPageModelResponse();
        return TeaModel.build(map, self);
    }

    public GetPageModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPageModelResponse setBody(GetPageModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPageModelResponseBody getBody() {
        return this.body;
    }

}
