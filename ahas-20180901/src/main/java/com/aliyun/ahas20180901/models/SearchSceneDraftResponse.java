// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SearchSceneDraftResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchSceneDraftResponseBody body;

    public static SearchSceneDraftResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchSceneDraftResponse self = new SearchSceneDraftResponse();
        return TeaModel.build(map, self);
    }

    public SearchSceneDraftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchSceneDraftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchSceneDraftResponse setBody(SearchSceneDraftResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchSceneDraftResponseBody getBody() {
        return this.body;
    }

}
