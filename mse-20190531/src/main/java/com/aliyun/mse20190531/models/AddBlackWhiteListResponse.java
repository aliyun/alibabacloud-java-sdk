// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddBlackWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddBlackWhiteListResponseBody body;

    public static AddBlackWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBlackWhiteListResponse self = new AddBlackWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public AddBlackWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBlackWhiteListResponse setBody(AddBlackWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBlackWhiteListResponseBody getBody() {
        return this.body;
    }

}
