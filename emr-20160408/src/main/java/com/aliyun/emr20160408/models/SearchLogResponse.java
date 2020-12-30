// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class SearchLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchLogResponseBody body;

    public static SearchLogResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchLogResponse self = new SearchLogResponse();
        return TeaModel.build(map, self);
    }

    public SearchLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchLogResponse setBody(SearchLogResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchLogResponseBody getBody() {
        return this.body;
    }

}
