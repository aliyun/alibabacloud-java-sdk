// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateNodeSupplementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNodeSupplementResponseBody body;

    public static CreateNodeSupplementResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeSupplementResponse self = new CreateNodeSupplementResponse();
        return TeaModel.build(map, self);
    }

    public CreateNodeSupplementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNodeSupplementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNodeSupplementResponse setBody(CreateNodeSupplementResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNodeSupplementResponseBody getBody() {
        return this.body;
    }

}
