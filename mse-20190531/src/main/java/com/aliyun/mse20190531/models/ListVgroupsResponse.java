// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListVgroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVgroupsResponseBody body;

    public static ListVgroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVgroupsResponse self = new ListVgroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListVgroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVgroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVgroupsResponse setBody(ListVgroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVgroupsResponseBody getBody() {
        return this.body;
    }

}
