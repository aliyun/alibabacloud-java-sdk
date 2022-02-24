// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetSearchConditionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSearchConditionResponseBody body;

    public static GetSearchConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSearchConditionResponse self = new GetSearchConditionResponse();
        return TeaModel.build(map, self);
    }

    public GetSearchConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSearchConditionResponse setBody(GetSearchConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSearchConditionResponseBody getBody() {
        return this.body;
    }

}
