// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetPublishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPublishResponseBody body;

    public static GetPublishResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublishResponse self = new GetPublishResponse();
        return TeaModel.build(map, self);
    }

    public GetPublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublishResponse setBody(GetPublishResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublishResponseBody getBody() {
        return this.body;
    }

}
