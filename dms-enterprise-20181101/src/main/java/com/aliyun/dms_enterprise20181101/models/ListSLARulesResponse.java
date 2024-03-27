// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSLARulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSLARulesResponseBody body;

    public static ListSLARulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSLARulesResponse self = new ListSLARulesResponse();
        return TeaModel.build(map, self);
    }

    public ListSLARulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSLARulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSLARulesResponse setBody(ListSLARulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSLARulesResponseBody getBody() {
        return this.body;
    }

}
