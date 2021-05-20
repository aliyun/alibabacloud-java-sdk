// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListQualityRulesResponseBody body;

    public static ListQualityRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQualityRulesResponse self = new ListQualityRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListQualityRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQualityRulesResponse setBody(ListQualityRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQualityRulesResponseBody getBody() {
        return this.body;
    }

}
