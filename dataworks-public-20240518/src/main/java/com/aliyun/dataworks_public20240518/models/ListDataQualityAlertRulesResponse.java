// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataQualityAlertRulesResponseBody body;

    public static ListDataQualityAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityAlertRulesResponse self = new ListDataQualityAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataQualityAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataQualityAlertRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataQualityAlertRulesResponse setBody(ListDataQualityAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataQualityAlertRulesResponseBody getBody() {
        return this.body;
    }

}
