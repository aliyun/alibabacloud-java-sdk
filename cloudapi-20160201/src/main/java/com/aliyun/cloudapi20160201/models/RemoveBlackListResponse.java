// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RemoveBlackListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveBlackListResponseBody body;

    public static RemoveBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveBlackListResponse self = new RemoveBlackListResponse();
        return TeaModel.build(map, self);
    }

    public RemoveBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveBlackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveBlackListResponse setBody(RemoveBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveBlackListResponseBody getBody() {
        return this.body;
    }

}
