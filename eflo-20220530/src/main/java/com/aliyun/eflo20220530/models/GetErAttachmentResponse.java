// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetErAttachmentResponseBody body;

    public static GetErAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetErAttachmentResponse self = new GetErAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public GetErAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetErAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetErAttachmentResponse setBody(GetErAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetErAttachmentResponseBody getBody() {
        return this.body;
    }

}
