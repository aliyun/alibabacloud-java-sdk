// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class AddBlackListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBlackListResponseBody body;

    public static AddBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBlackListResponse self = new AddBlackListResponse();
        return TeaModel.build(map, self);
    }

    public AddBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBlackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBlackListResponse setBody(AddBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBlackListResponseBody getBody() {
        return this.body;
    }

}
