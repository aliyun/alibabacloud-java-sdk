// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CommonApplyQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CommonApplyQueryResponseBody body;

    public static CommonApplyQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CommonApplyQueryResponse self = new CommonApplyQueryResponse();
        return TeaModel.build(map, self);
    }

    public CommonApplyQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommonApplyQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommonApplyQueryResponse setBody(CommonApplyQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CommonApplyQueryResponseBody getBody() {
        return this.body;
    }

}
