// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSmsMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSmsMetadataResponseBody body;

    public static ListSmsMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSmsMetadataResponse self = new ListSmsMetadataResponse();
        return TeaModel.build(map, self);
    }

    public ListSmsMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSmsMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSmsMetadataResponse setBody(ListSmsMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSmsMetadataResponseBody getBody() {
        return this.body;
    }

}
