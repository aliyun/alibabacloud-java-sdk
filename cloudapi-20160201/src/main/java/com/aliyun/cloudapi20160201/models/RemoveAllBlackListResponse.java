// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RemoveAllBlackListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveAllBlackListResponseBody body;

    public static RemoveAllBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAllBlackListResponse self = new RemoveAllBlackListResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAllBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAllBlackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAllBlackListResponse setBody(RemoveAllBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAllBlackListResponseBody getBody() {
        return this.body;
    }

}
