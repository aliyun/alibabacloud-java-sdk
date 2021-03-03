// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobFileUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobFileUploadUrlResponseBody body;

    public static GetJobFileUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobFileUploadUrlResponse self = new GetJobFileUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetJobFileUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobFileUploadUrlResponse setBody(GetJobFileUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobFileUploadUrlResponseBody getBody() {
        return this.body;
    }

}
