// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetUserApplicationGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserApplicationGroupsResponseBody body;

    public static GetUserApplicationGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserApplicationGroupsResponse self = new GetUserApplicationGroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetUserApplicationGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserApplicationGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserApplicationGroupsResponse setBody(GetUserApplicationGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserApplicationGroupsResponseBody getBody() {
        return this.body;
    }

}
