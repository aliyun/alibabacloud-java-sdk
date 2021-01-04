// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class RemoveClientFromBlackListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveClientFromBlackListResponseBody body;

    public static RemoveClientFromBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveClientFromBlackListResponse self = new RemoveClientFromBlackListResponse();
        return TeaModel.build(map, self);
    }

    public RemoveClientFromBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveClientFromBlackListResponse setBody(RemoveClientFromBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveClientFromBlackListResponseBody getBody() {
        return this.body;
    }

}
