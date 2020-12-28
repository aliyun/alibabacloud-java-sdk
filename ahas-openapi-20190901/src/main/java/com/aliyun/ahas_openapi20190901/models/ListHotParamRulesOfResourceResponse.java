// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListHotParamRulesOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHotParamRulesOfResourceResponseBody body;

    public static ListHotParamRulesOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotParamRulesOfResourceResponse self = new ListHotParamRulesOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListHotParamRulesOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotParamRulesOfResourceResponse setBody(ListHotParamRulesOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotParamRulesOfResourceResponseBody getBody() {
        return this.body;
    }

}
