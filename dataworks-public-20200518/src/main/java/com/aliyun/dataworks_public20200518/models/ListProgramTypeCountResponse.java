// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProgramTypeCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProgramTypeCountResponseBody body;

    public static ListProgramTypeCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProgramTypeCountResponse self = new ListProgramTypeCountResponse();
        return TeaModel.build(map, self);
    }

    public ListProgramTypeCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProgramTypeCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProgramTypeCountResponse setBody(ListProgramTypeCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProgramTypeCountResponseBody getBody() {
        return this.body;
    }

}
