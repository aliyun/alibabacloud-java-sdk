// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBatchTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBatchTemplatesResponseBody body;

    public static ListBatchTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBatchTemplatesResponse self = new ListBatchTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListBatchTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBatchTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBatchTemplatesResponse setBody(ListBatchTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBatchTemplatesResponseBody getBody() {
        return this.body;
    }

}
