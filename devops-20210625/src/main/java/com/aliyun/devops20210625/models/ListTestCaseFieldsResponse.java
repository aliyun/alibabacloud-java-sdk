// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListTestCaseFieldsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTestCaseFieldsResponseBody body;

    public static ListTestCaseFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTestCaseFieldsResponse self = new ListTestCaseFieldsResponse();
        return TeaModel.build(map, self);
    }

    public ListTestCaseFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTestCaseFieldsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTestCaseFieldsResponse setBody(ListTestCaseFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTestCaseFieldsResponseBody getBody() {
        return this.body;
    }

}
