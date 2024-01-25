// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetResourceTagDropListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceTagDropListResponseBody body;

    public static GetResourceTagDropListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTagDropListResponse self = new GetResourceTagDropListResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceTagDropListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceTagDropListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceTagDropListResponse setBody(GetResourceTagDropListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceTagDropListResponseBody getBody() {
        return this.body;
    }

}
