// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccAlgModelingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCsccAlgModelingsResponseBody body;

    public static ListCsccAlgModelingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCsccAlgModelingsResponse self = new ListCsccAlgModelingsResponse();
        return TeaModel.build(map, self);
    }

    public ListCsccAlgModelingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCsccAlgModelingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCsccAlgModelingsResponse setBody(ListCsccAlgModelingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCsccAlgModelingsResponseBody getBody() {
        return this.body;
    }

}
