// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class SearchUserApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchUserApplicationsResponseBody body;

    public static SearchUserApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchUserApplicationsResponse self = new SearchUserApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public SearchUserApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchUserApplicationsResponse setBody(SearchUserApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchUserApplicationsResponseBody getBody() {
        return this.body;
    }

}
