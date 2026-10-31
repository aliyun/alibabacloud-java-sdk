// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListPythonModulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPythonModulesResponseBody body;

    public static ListPythonModulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPythonModulesResponse self = new ListPythonModulesResponse();
        return TeaModel.build(map, self);
    }

    public ListPythonModulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPythonModulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPythonModulesResponse setBody(ListPythonModulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPythonModulesResponseBody getBody() {
        return this.body;
    }

}
