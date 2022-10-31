// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RemoveShowFromShowListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveShowFromShowListResponseBody body;

    public static RemoveShowFromShowListResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveShowFromShowListResponse self = new RemoveShowFromShowListResponse();
        return TeaModel.build(map, self);
    }

    public RemoveShowFromShowListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveShowFromShowListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveShowFromShowListResponse setBody(RemoveShowFromShowListResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveShowFromShowListResponseBody getBody() {
        return this.body;
    }

}
