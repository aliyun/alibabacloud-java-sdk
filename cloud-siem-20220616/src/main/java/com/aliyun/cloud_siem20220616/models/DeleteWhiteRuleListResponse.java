// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteWhiteRuleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWhiteRuleListResponseBody body;

    public static DeleteWhiteRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhiteRuleListResponse self = new DeleteWhiteRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWhiteRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWhiteRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWhiteRuleListResponse setBody(DeleteWhiteRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWhiteRuleListResponseBody getBody() {
        return this.body;
    }

}
