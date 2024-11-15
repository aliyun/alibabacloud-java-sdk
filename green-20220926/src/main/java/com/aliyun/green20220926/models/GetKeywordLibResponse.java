// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetKeywordLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKeywordLibResponseBody body;

    public static GetKeywordLibResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKeywordLibResponse self = new GetKeywordLibResponse();
        return TeaModel.build(map, self);
    }

    public GetKeywordLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKeywordLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKeywordLibResponse setBody(GetKeywordLibResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKeywordLibResponseBody getBody() {
        return this.body;
    }

}
