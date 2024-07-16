// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListBatchOperateCardsTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBatchOperateCardsTasksResponseBody body;

    public static ListBatchOperateCardsTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBatchOperateCardsTasksResponse self = new ListBatchOperateCardsTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListBatchOperateCardsTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBatchOperateCardsTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBatchOperateCardsTasksResponse setBody(ListBatchOperateCardsTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBatchOperateCardsTasksResponseBody getBody() {
        return this.body;
    }

}
