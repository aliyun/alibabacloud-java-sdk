// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMyRelatedApprovalsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMyRelatedApprovalsResponseBody body;

    public static ListMyRelatedApprovalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMyRelatedApprovalsResponse self = new ListMyRelatedApprovalsResponse();
        return TeaModel.build(map, self);
    }

    public ListMyRelatedApprovalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMyRelatedApprovalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMyRelatedApprovalsResponse setBody(ListMyRelatedApprovalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMyRelatedApprovalsResponseBody getBody() {
        return this.body;
    }

}
