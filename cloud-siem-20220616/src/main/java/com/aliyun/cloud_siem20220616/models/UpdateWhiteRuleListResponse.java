// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class UpdateWhiteRuleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWhiteRuleListResponseBody body;

    public static UpdateWhiteRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteRuleListResponse self = new UpdateWhiteRuleListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWhiteRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWhiteRuleListResponse setBody(UpdateWhiteRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWhiteRuleListResponseBody getBody() {
        return this.body;
    }

}
