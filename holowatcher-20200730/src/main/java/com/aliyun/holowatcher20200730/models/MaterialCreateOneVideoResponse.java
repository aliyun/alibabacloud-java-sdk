// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialCreateOneVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MaterialCreateOneVideoResponseBody body;

    public static MaterialCreateOneVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        MaterialCreateOneVideoResponse self = new MaterialCreateOneVideoResponse();
        return TeaModel.build(map, self);
    }

    public MaterialCreateOneVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MaterialCreateOneVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MaterialCreateOneVideoResponse setBody(MaterialCreateOneVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public MaterialCreateOneVideoResponseBody getBody() {
        return this.body;
    }

}
