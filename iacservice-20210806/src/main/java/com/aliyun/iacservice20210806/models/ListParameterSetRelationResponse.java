// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListParameterSetRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListParameterSetRelationResponseBody body;

    public static ListParameterSetRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListParameterSetRelationResponse self = new ListParameterSetRelationResponse();
        return TeaModel.build(map, self);
    }

    public ListParameterSetRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListParameterSetRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListParameterSetRelationResponse setBody(ListParameterSetRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListParameterSetRelationResponseBody getBody() {
        return this.body;
    }

}
