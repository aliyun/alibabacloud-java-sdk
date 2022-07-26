// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetTopicListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTopicListResponseBody body;

    public static GetTopicListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTopicListResponse self = new GetTopicListResponse();
        return TeaModel.build(map, self);
    }

    public GetTopicListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTopicListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTopicListResponse setBody(GetTopicListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTopicListResponseBody getBody() {
        return this.body;
    }

}
