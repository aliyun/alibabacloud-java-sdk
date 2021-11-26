// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPublicMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPublicMediaInfoResponseBody body;

    public static GetPublicMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublicMediaInfoResponse self = new GetPublicMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPublicMediaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublicMediaInfoResponse setBody(GetPublicMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublicMediaInfoResponseBody getBody() {
        return this.body;
    }

}
