// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataQualityRulesResponseBody body;

    public static ListDataQualityRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityRulesResponse self = new ListDataQualityRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataQualityRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataQualityRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataQualityRulesResponse setBody(ListDataQualityRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataQualityRulesResponseBody getBody() {
        return this.body;
    }

}
