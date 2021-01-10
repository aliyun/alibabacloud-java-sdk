// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchMediaWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchMediaWorkflowResponseBody body;

    public static SearchMediaWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaWorkflowResponse self = new SearchMediaWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public SearchMediaWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMediaWorkflowResponse setBody(SearchMediaWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMediaWorkflowResponseBody getBody() {
        return this.body;
    }

}
