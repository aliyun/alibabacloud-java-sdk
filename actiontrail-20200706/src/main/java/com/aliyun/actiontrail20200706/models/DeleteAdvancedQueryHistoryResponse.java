// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteAdvancedQueryHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAdvancedQueryHistoryResponseBody body;

    public static DeleteAdvancedQueryHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdvancedQueryHistoryResponse self = new DeleteAdvancedQueryHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAdvancedQueryHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAdvancedQueryHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAdvancedQueryHistoryResponse setBody(DeleteAdvancedQueryHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAdvancedQueryHistoryResponseBody getBody() {
        return this.body;
    }

}
