// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListShiftPersonnelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListShiftPersonnelsResponseBody body;

    public static ListShiftPersonnelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShiftPersonnelsResponse self = new ListShiftPersonnelsResponse();
        return TeaModel.build(map, self);
    }

    public ListShiftPersonnelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShiftPersonnelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListShiftPersonnelsResponse setBody(ListShiftPersonnelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListShiftPersonnelsResponseBody getBody() {
        return this.body;
    }

}
