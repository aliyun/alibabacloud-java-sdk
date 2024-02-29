// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class RemoveClientFromBlackListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemoveClientFromBlackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveClientFromBlackListResponse setBody(RemoveClientFromBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveClientFromBlackListResponseBody getBody() {
        return this.body;
    }

}
