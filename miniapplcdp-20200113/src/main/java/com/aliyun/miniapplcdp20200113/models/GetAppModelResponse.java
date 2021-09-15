// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetAppModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppModelResponseBody body;

    public static GetAppModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppModelResponse self = new GetAppModelResponse();
        return TeaModel.build(map, self);
    }

    public GetAppModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppModelResponse setBody(GetAppModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppModelResponseBody getBody() {
        return this.body;
    }

}
