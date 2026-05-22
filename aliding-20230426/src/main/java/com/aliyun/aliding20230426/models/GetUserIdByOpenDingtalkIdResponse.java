// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserIdByOpenDingtalkIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserIdByOpenDingtalkIdResponseBody body;

    public static GetUserIdByOpenDingtalkIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByOpenDingtalkIdResponse self = new GetUserIdByOpenDingtalkIdResponse();
        return TeaModel.build(map, self);
    }

    public GetUserIdByOpenDingtalkIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserIdByOpenDingtalkIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserIdByOpenDingtalkIdResponse setBody(GetUserIdByOpenDingtalkIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserIdByOpenDingtalkIdResponseBody getBody() {
        return this.body;
    }

}
