// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateBizTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBizTypeResponseBody body;

    public static CreateBizTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBizTypeResponse self = new CreateBizTypeResponse();
        return TeaModel.build(map, self);
    }

    public CreateBizTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBizTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBizTypeResponse setBody(CreateBizTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBizTypeResponseBody getBody() {
        return this.body;
    }

}
