// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDetectionRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDetectionRulesResponseBody body;

    public static ListDetectionRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionRulesResponse self = new ListDetectionRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListDetectionRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDetectionRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDetectionRulesResponse setBody(ListDetectionRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDetectionRulesResponseBody getBody() {
        return this.body;
    }

}
