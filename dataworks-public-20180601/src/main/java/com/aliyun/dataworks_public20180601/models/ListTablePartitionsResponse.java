// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListTablePartitionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTablePartitionsResponseBody body;

    public static ListTablePartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTablePartitionsResponse self = new ListTablePartitionsResponse();
        return TeaModel.build(map, self);
    }

    public ListTablePartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTablePartitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTablePartitionsResponse setBody(ListTablePartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTablePartitionsResponseBody getBody() {
        return this.body;
    }

}
