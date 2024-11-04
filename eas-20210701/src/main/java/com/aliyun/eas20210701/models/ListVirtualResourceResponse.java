// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListVirtualResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirtualResourceResponseBody body;

    public static ListVirtualResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualResourceResponse self = new ListVirtualResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListVirtualResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirtualResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirtualResourceResponse setBody(ListVirtualResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirtualResourceResponseBody getBody() {
        return this.body;
    }

}
