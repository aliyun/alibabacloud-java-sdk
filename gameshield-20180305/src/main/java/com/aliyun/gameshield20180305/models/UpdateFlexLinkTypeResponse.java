// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexLinkTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFlexLinkTypeResponseBody body;

    public static UpdateFlexLinkTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexLinkTypeResponse self = new UpdateFlexLinkTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlexLinkTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlexLinkTypeResponse setBody(UpdateFlexLinkTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlexLinkTypeResponseBody getBody() {
        return this.body;
    }

}
