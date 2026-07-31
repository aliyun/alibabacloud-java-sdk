// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSemanticViewNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSemanticViewNamesResponseBody body;

    public static ListSemanticViewNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSemanticViewNamesResponse self = new ListSemanticViewNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListSemanticViewNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSemanticViewNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSemanticViewNamesResponse setBody(ListSemanticViewNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSemanticViewNamesResponseBody getBody() {
        return this.body;
    }

}
