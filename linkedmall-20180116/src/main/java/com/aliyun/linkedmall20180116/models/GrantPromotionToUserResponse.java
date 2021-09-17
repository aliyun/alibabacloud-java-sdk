// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GrantPromotionToUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantPromotionToUserResponseBody body;

    public static GrantPromotionToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantPromotionToUserResponse self = new GrantPromotionToUserResponse();
        return TeaModel.build(map, self);
    }

    public GrantPromotionToUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantPromotionToUserResponse setBody(GrantPromotionToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantPromotionToUserResponseBody getBody() {
        return this.body;
    }

}
