// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateFileByBizResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFileByBizResponseBody body;

    public static CreateFileByBizResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileByBizResponse self = new CreateFileByBizResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileByBizResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileByBizResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFileByBizResponse setBody(CreateFileByBizResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileByBizResponseBody getBody() {
        return this.body;
    }

}
