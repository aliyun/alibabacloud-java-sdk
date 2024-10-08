// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafTemplateRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWafTemplateRulesResponseBody body;

    public static ListWafTemplateRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWafTemplateRulesResponse self = new ListWafTemplateRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListWafTemplateRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWafTemplateRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWafTemplateRulesResponse setBody(ListWafTemplateRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWafTemplateRulesResponseBody getBody() {
        return this.body;
    }

}
