// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListLakeStoragesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLakeStoragesResponseBody body;

    public static ListLakeStoragesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLakeStoragesResponse self = new ListLakeStoragesResponse();
        return TeaModel.build(map, self);
    }

    public ListLakeStoragesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLakeStoragesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLakeStoragesResponse setBody(ListLakeStoragesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLakeStoragesResponseBody getBody() {
        return this.body;
    }

}
