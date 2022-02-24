// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class SearchCorpByKeywordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchCorpByKeywordResponseBody body;

    public static SearchCorpByKeywordResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchCorpByKeywordResponse self = new SearchCorpByKeywordResponse();
        return TeaModel.build(map, self);
    }

    public SearchCorpByKeywordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchCorpByKeywordResponse setBody(SearchCorpByKeywordResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchCorpByKeywordResponseBody getBody() {
        return this.body;
    }

}
