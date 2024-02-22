// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCustomizeRuleTestResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomizeRuleTestResultResponseBody body;

    public static ListCustomizeRuleTestResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizeRuleTestResultResponse self = new ListCustomizeRuleTestResultResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomizeRuleTestResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomizeRuleTestResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomizeRuleTestResultResponse setBody(ListCustomizeRuleTestResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomizeRuleTestResultResponseBody getBody() {
        return this.body;
    }

}
