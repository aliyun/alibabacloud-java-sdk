// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SearchUserSceneFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchUserSceneFunctionResponseBody body;

    public static SearchUserSceneFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchUserSceneFunctionResponse self = new SearchUserSceneFunctionResponse();
        return TeaModel.build(map, self);
    }

    public SearchUserSceneFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchUserSceneFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchUserSceneFunctionResponse setBody(SearchUserSceneFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchUserSceneFunctionResponseBody getBody() {
        return this.body;
    }

}
