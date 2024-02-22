// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMetricRuleBlackListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMetricRuleBlackListResponseBody body;

    public static ModifyMetricRuleBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMetricRuleBlackListResponse self = new ModifyMetricRuleBlackListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMetricRuleBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMetricRuleBlackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMetricRuleBlackListResponse setBody(ModifyMetricRuleBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMetricRuleBlackListResponseBody getBody() {
        return this.body;
    }

}
