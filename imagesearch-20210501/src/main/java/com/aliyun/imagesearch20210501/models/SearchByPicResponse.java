// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210501.models;

import com.aliyun.tea.*;

public class SearchByPicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchByPicResponseBody body;

    public static SearchByPicResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchByPicResponse self = new SearchByPicResponse();
        return TeaModel.build(map, self);
    }

    public SearchByPicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchByPicResponse setBody(SearchByPicResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchByPicResponseBody getBody() {
        return this.body;
    }

}
