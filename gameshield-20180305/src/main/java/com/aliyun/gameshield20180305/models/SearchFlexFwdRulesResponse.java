// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class SearchFlexFwdRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchFlexFwdRulesResponseBody body;

    public static SearchFlexFwdRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchFlexFwdRulesResponse self = new SearchFlexFwdRulesResponse();
        return TeaModel.build(map, self);
    }

    public SearchFlexFwdRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchFlexFwdRulesResponse setBody(SearchFlexFwdRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchFlexFwdRulesResponseBody getBody() {
        return this.body;
    }

}
