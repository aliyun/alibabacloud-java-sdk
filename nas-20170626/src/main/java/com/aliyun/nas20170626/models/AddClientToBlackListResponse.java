// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AddClientToBlackListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddClientToBlackListResponseBody body;

    public static AddClientToBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddClientToBlackListResponse self = new AddClientToBlackListResponse();
        return TeaModel.build(map, self);
    }

    public AddClientToBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddClientToBlackListResponse setBody(AddClientToBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddClientToBlackListResponseBody getBody() {
        return this.body;
    }

}
