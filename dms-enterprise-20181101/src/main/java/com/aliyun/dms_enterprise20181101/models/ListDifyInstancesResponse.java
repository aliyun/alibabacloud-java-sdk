// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDifyInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDifyInstancesResponseBody body;

    public static ListDifyInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDifyInstancesResponse self = new ListDifyInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListDifyInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDifyInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDifyInstancesResponse setBody(ListDifyInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDifyInstancesResponseBody getBody() {
        return this.body;
    }

}
