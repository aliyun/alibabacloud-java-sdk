// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetSaseUserTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSaseUserTagResponseBody body;

    public static GetSaseUserTagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSaseUserTagResponse self = new GetSaseUserTagResponse();
        return TeaModel.build(map, self);
    }

    public GetSaseUserTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSaseUserTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSaseUserTagResponse setBody(GetSaseUserTagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSaseUserTagResponseBody getBody() {
        return this.body;
    }

}
