// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByPicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchImageByPicResponseBody body;

    public static SearchImageByPicResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicResponse self = new SearchImageByPicResponse();
        return TeaModel.build(map, self);
    }

    public SearchImageByPicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchImageByPicResponse setBody(SearchImageByPicResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchImageByPicResponseBody getBody() {
        return this.body;
    }

}
