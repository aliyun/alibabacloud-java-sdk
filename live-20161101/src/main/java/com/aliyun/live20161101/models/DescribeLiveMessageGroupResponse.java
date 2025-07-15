// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveMessageGroupResponseBody body;

    public static DescribeLiveMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveMessageGroupResponse self = new DescribeLiveMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveMessageGroupResponse setBody(DescribeLiveMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveMessageGroupResponseBody getBody() {
        return this.body;
    }

}
