// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListApplicationsWithTagRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplicationsWithTagRulesResponseBody body;

    public static ListApplicationsWithTagRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsWithTagRulesResponse self = new ListApplicationsWithTagRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsWithTagRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationsWithTagRulesResponse setBody(ListApplicationsWithTagRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationsWithTagRulesResponseBody getBody() {
        return this.body;
    }

}
