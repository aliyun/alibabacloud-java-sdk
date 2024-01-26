// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSyntheticTaskListResponseBody body;

    public static GetSyntheticTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticTaskListResponse self = new GetSyntheticTaskListResponse();
        return TeaModel.build(map, self);
    }

    public GetSyntheticTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSyntheticTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSyntheticTaskListResponse setBody(GetSyntheticTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSyntheticTaskListResponseBody getBody() {
        return this.body;
    }

}
