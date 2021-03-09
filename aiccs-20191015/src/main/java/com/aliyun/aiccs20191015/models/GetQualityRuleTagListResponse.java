// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityRuleTagListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQualityRuleTagListResponseBody body;

    public static GetQualityRuleTagListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleTagListResponse self = new GetQualityRuleTagListResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleTagListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityRuleTagListResponse setBody(GetQualityRuleTagListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityRuleTagListResponseBody getBody() {
        return this.body;
    }

}
