// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetRecycleBinAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRecycleBinAttributeResponseBody body;

    public static GetRecycleBinAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecycleBinAttributeResponse self = new GetRecycleBinAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetRecycleBinAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecycleBinAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecycleBinAttributeResponse setBody(GetRecycleBinAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecycleBinAttributeResponseBody getBody() {
        return this.body;
    }

}
