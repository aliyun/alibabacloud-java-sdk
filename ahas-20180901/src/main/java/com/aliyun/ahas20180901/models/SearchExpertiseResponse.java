// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SearchExpertiseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchExpertiseResponseBody body;

    public static SearchExpertiseResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchExpertiseResponse self = new SearchExpertiseResponse();
        return TeaModel.build(map, self);
    }

    public SearchExpertiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchExpertiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchExpertiseResponse setBody(SearchExpertiseResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchExpertiseResponseBody getBody() {
        return this.body;
    }

}
