// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteResourceInformationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResourceInformationResponseBody body;

    public static DeleteResourceInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceInformationResponse self = new DeleteResourceInformationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceInformationResponse setBody(DeleteResourceInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceInformationResponseBody getBody() {
        return this.body;
    }

}
