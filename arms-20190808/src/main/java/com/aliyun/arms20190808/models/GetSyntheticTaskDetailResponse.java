// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSyntheticTaskDetailResponseBody body;

    public static GetSyntheticTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticTaskDetailResponse self = new GetSyntheticTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSyntheticTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSyntheticTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSyntheticTaskDetailResponse setBody(GetSyntheticTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSyntheticTaskDetailResponseBody getBody() {
        return this.body;
    }

}
