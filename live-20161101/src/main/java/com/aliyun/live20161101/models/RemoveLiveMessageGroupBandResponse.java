// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RemoveLiveMessageGroupBandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveLiveMessageGroupBandResponseBody body;

    public static RemoveLiveMessageGroupBandResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLiveMessageGroupBandResponse self = new RemoveLiveMessageGroupBandResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLiveMessageGroupBandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLiveMessageGroupBandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveLiveMessageGroupBandResponse setBody(RemoveLiveMessageGroupBandResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLiveMessageGroupBandResponseBody getBody() {
        return this.body;
    }

}
