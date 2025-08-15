// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateAdvancedQueryHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAdvancedQueryHistoryResponseBody body;

    public static CreateAdvancedQueryHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAdvancedQueryHistoryResponse self = new CreateAdvancedQueryHistoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateAdvancedQueryHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAdvancedQueryHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAdvancedQueryHistoryResponse setBody(CreateAdvancedQueryHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAdvancedQueryHistoryResponseBody getBody() {
        return this.body;
    }

}
