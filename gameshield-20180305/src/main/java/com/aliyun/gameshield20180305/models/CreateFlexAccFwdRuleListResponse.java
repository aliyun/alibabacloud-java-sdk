// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateFlexAccFwdRuleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlexAccFwdRuleListResponseBody body;

    public static CreateFlexAccFwdRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlexAccFwdRuleListResponse self = new CreateFlexAccFwdRuleListResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlexAccFwdRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlexAccFwdRuleListResponse setBody(CreateFlexAccFwdRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlexAccFwdRuleListResponseBody getBody() {
        return this.body;
    }

}
