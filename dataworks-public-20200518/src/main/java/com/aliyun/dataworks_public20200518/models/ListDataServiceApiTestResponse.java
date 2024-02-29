// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApiTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataServiceApiTestResponseBody body;

    public static ListDataServiceApiTestResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiTestResponse self = new ListDataServiceApiTestResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceApiTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataServiceApiTestResponse setBody(ListDataServiceApiTestResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceApiTestResponseBody getBody() {
        return this.body;
    }

}
