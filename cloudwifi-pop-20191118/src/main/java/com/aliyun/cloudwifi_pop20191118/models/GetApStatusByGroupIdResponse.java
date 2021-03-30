// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApStatusByGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApStatusByGroupIdResponseBody body;

    public static GetApStatusByGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApStatusByGroupIdResponse self = new GetApStatusByGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public GetApStatusByGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApStatusByGroupIdResponse setBody(GetApStatusByGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApStatusByGroupIdResponseBody getBody() {
        return this.body;
    }

}
