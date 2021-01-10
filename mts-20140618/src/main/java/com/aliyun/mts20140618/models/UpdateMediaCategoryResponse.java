// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMediaCategoryResponseBody body;

    public static UpdateMediaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaCategoryResponse self = new UpdateMediaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaCategoryResponse setBody(UpdateMediaCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaCategoryResponseBody getBody() {
        return this.body;
    }

}
