// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UnbanLiveMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbanLiveMessageGroupResponseBody body;

    public static UnbanLiveMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbanLiveMessageGroupResponse self = new UnbanLiveMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public UnbanLiveMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbanLiveMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbanLiveMessageGroupResponse setBody(UnbanLiveMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbanLiveMessageGroupResponseBody getBody() {
        return this.body;
    }

}
