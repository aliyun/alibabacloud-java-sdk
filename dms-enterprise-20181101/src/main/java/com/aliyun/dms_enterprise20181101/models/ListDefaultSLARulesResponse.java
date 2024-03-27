// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDefaultSLARulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDefaultSLARulesResponseBody body;

    public static ListDefaultSLARulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultSLARulesResponse self = new ListDefaultSLARulesResponse();
        return TeaModel.build(map, self);
    }

    public ListDefaultSLARulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDefaultSLARulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDefaultSLARulesResponse setBody(ListDefaultSLARulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDefaultSLARulesResponseBody getBody() {
        return this.body;
    }

}
