// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListTopicViewPointRecommendEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTopicViewPointRecommendEventListResponseBody body;

    public static ListTopicViewPointRecommendEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTopicViewPointRecommendEventListResponse self = new ListTopicViewPointRecommendEventListResponse();
        return TeaModel.build(map, self);
    }

    public ListTopicViewPointRecommendEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTopicViewPointRecommendEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTopicViewPointRecommendEventListResponse setBody(ListTopicViewPointRecommendEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTopicViewPointRecommendEventListResponseBody getBody() {
        return this.body;
    }

}
