// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListHiveTableLineagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHiveTableLineagesResponseBody body;

    public static ListHiveTableLineagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHiveTableLineagesResponse self = new ListHiveTableLineagesResponse();
        return TeaModel.build(map, self);
    }

    public ListHiveTableLineagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHiveTableLineagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHiveTableLineagesResponse setBody(ListHiveTableLineagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHiveTableLineagesResponseBody getBody() {
        return this.body;
    }

}
