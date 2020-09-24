// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class SaveAllPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveAllPoliciesResponseBody body;

    public static SaveAllPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAllPoliciesResponse self = new SaveAllPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public SaveAllPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAllPoliciesResponse setBody(SaveAllPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAllPoliciesResponseBody getBody() {
        return this.body;
    }

}
