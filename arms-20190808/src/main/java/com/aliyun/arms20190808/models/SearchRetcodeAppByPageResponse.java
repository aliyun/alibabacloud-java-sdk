// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchRetcodeAppByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchRetcodeAppByPageResponseBody body;

    public static SearchRetcodeAppByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchRetcodeAppByPageResponse self = new SearchRetcodeAppByPageResponse();
        return TeaModel.build(map, self);
    }

    public SearchRetcodeAppByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchRetcodeAppByPageResponse setBody(SearchRetcodeAppByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchRetcodeAppByPageResponseBody getBody() {
        return this.body;
    }

}
