// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserWafRulesetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserWafRulesetsResponseBody body;

    public static ListUserWafRulesetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserWafRulesetsResponse self = new ListUserWafRulesetsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserWafRulesetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserWafRulesetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserWafRulesetsResponse setBody(ListUserWafRulesetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserWafRulesetsResponseBody getBody() {
        return this.body;
    }

}
