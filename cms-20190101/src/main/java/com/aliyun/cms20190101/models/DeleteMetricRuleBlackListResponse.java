// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleBlackListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMetricRuleBlackListResponseBody body;

    public static DeleteMetricRuleBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleBlackListResponse self = new DeleteMetricRuleBlackListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRuleBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetricRuleBlackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMetricRuleBlackListResponse setBody(DeleteMetricRuleBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetricRuleBlackListResponseBody getBody() {
        return this.body;
    }

}
