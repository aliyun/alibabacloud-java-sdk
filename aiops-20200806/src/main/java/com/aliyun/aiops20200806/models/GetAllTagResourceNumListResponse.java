// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAllTagResourceNumListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAllTagResourceNumListResponseBody body;

    public static GetAllTagResourceNumListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllTagResourceNumListResponse self = new GetAllTagResourceNumListResponse();
        return TeaModel.build(map, self);
    }

    public GetAllTagResourceNumListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllTagResourceNumListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAllTagResourceNumListResponse setBody(GetAllTagResourceNumListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllTagResourceNumListResponseBody getBody() {
        return this.body;
    }

}
