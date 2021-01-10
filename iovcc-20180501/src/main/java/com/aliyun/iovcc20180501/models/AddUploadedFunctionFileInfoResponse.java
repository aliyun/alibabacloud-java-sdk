// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddUploadedFunctionFileInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddUploadedFunctionFileInfoResponseBody body;

    public static AddUploadedFunctionFileInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUploadedFunctionFileInfoResponse self = new AddUploadedFunctionFileInfoResponse();
        return TeaModel.build(map, self);
    }

    public AddUploadedFunctionFileInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUploadedFunctionFileInfoResponse setBody(AddUploadedFunctionFileInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUploadedFunctionFileInfoResponseBody getBody() {
        return this.body;
    }

}
