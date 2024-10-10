// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataSourceSharedRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataSourceSharedRulesResponseBody body;

    public static ListDataSourceSharedRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceSharedRulesResponse self = new ListDataSourceSharedRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceSharedRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceSharedRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSourceSharedRulesResponse setBody(ListDataSourceSharedRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceSharedRulesResponseBody getBody() {
        return this.body;
    }

}
