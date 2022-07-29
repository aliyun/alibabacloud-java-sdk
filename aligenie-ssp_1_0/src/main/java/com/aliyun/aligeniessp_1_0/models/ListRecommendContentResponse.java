// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListRecommendContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRecommendContentResponseBody body;

    public static ListRecommendContentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecommendContentResponse self = new ListRecommendContentResponse();
        return TeaModel.build(map, self);
    }

    public ListRecommendContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecommendContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecommendContentResponse setBody(ListRecommendContentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecommendContentResponseBody getBody() {
        return this.body;
    }

}
