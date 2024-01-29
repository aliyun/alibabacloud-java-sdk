// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemAttachmentCreatemetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkitemAttachmentCreatemetaResponseBody body;

    public static GetWorkitemAttachmentCreatemetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemAttachmentCreatemetaResponse self = new GetWorkitemAttachmentCreatemetaResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkitemAttachmentCreatemetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkitemAttachmentCreatemetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkitemAttachmentCreatemetaResponse setBody(GetWorkitemAttachmentCreatemetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkitemAttachmentCreatemetaResponseBody getBody() {
        return this.body;
    }

}
