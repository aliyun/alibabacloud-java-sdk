// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BanLiveMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BanLiveMessageGroupResponseBody body;

    public static BanLiveMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        BanLiveMessageGroupResponse self = new BanLiveMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public BanLiveMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BanLiveMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BanLiveMessageGroupResponse setBody(BanLiveMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public BanLiveMessageGroupResponseBody getBody() {
        return this.body;
    }

}
