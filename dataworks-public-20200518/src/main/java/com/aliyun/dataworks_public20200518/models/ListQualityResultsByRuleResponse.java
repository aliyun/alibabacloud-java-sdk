// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListQualityResultsByRuleResponseBody body;

    public static ListQualityResultsByRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQualityResultsByRuleResponse self = new ListQualityResultsByRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListQualityResultsByRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQualityResultsByRuleResponse setBody(ListQualityResultsByRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQualityResultsByRuleResponseBody getBody() {
        return this.body;
    }

}
