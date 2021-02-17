// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetImageCroppingSuggestionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetImageCroppingSuggestionsResponseBody body;

    public static GetImageCroppingSuggestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageCroppingSuggestionsResponse self = new GetImageCroppingSuggestionsResponse();
        return TeaModel.build(map, self);
    }

    public GetImageCroppingSuggestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageCroppingSuggestionsResponse setBody(GetImageCroppingSuggestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageCroppingSuggestionsResponseBody getBody() {
        return this.body;
    }

}
