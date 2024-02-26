// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetAllInstanceIdListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAllInstanceIdListResponseBody body;

    public static GetAllInstanceIdListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllInstanceIdListResponse self = new GetAllInstanceIdListResponse();
        return TeaModel.build(map, self);
    }

    public GetAllInstanceIdListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllInstanceIdListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAllInstanceIdListResponse setBody(GetAllInstanceIdListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllInstanceIdListResponseBody getBody() {
        return this.body;
    }

}
