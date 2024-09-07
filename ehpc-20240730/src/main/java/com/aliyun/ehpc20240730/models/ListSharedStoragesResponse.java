// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListSharedStoragesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSharedStoragesResponseBody body;

    public static ListSharedStoragesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSharedStoragesResponse self = new ListSharedStoragesResponse();
        return TeaModel.build(map, self);
    }

    public ListSharedStoragesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSharedStoragesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSharedStoragesResponse setBody(ListSharedStoragesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSharedStoragesResponseBody getBody() {
        return this.body;
    }

}
