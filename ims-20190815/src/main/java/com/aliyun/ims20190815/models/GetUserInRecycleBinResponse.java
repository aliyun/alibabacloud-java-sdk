// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserInRecycleBinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserInRecycleBinResponseBody body;

    public static GetUserInRecycleBinResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserInRecycleBinResponse self = new GetUserInRecycleBinResponse();
        return TeaModel.build(map, self);
    }

    public GetUserInRecycleBinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserInRecycleBinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserInRecycleBinResponse setBody(GetUserInRecycleBinResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserInRecycleBinResponseBody getBody() {
        return this.body;
    }

}
