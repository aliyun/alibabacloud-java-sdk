// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceTestCasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceTestCasesResponseBody body;

    public static ListServiceTestCasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTestCasesResponse self = new ListServiceTestCasesResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceTestCasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceTestCasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceTestCasesResponse setBody(ListServiceTestCasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceTestCasesResponseBody getBody() {
        return this.body;
    }

}
