// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCommonCateSecondFloorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCommonCateSecondFloorResponseBody body;

    public static ListCommonCateSecondFloorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommonCateSecondFloorResponse self = new ListCommonCateSecondFloorResponse();
        return TeaModel.build(map, self);
    }

    public ListCommonCateSecondFloorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommonCateSecondFloorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCommonCateSecondFloorResponse setBody(ListCommonCateSecondFloorResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommonCateSecondFloorResponseBody getBody() {
        return this.body;
    }

}
