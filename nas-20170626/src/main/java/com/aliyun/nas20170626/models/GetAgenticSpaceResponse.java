// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetAgenticSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgenticSpaceResponseBody body;

    public static GetAgenticSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticSpaceResponse self = new GetAgenticSpaceResponse();
        return TeaModel.build(map, self);
    }

    public GetAgenticSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgenticSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgenticSpaceResponse setBody(GetAgenticSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgenticSpaceResponseBody getBody() {
        return this.body;
    }

}
