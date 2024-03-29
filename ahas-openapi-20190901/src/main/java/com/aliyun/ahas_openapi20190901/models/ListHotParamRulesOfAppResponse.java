// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListHotParamRulesOfAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHotParamRulesOfAppResponseBody body;

    public static ListHotParamRulesOfAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotParamRulesOfAppResponse self = new ListHotParamRulesOfAppResponse();
        return TeaModel.build(map, self);
    }

    public ListHotParamRulesOfAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotParamRulesOfAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotParamRulesOfAppResponse setBody(ListHotParamRulesOfAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotParamRulesOfAppResponseBody getBody() {
        return this.body;
    }

}
