// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCommonCateFirstFloorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCommonCateFirstFloorResponseBody body;

    public static ListCommonCateFirstFloorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommonCateFirstFloorResponse self = new ListCommonCateFirstFloorResponse();
        return TeaModel.build(map, self);
    }

    public ListCommonCateFirstFloorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommonCateFirstFloorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCommonCateFirstFloorResponse setBody(ListCommonCateFirstFloorResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommonCateFirstFloorResponseBody getBody() {
        return this.body;
    }

}
