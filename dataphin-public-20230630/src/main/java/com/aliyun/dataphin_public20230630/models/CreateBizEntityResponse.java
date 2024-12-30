// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBizEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBizEntityResponseBody body;

    public static CreateBizEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBizEntityResponse self = new CreateBizEntityResponse();
        return TeaModel.build(map, self);
    }

    public CreateBizEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBizEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBizEntityResponse setBody(CreateBizEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBizEntityResponseBody getBody() {
        return this.body;
    }

}
