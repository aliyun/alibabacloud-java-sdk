// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateIPv6Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIPv6ResponseBody body;

    public static UpdateIPv6Response build(java.util.Map<String, ?> map) throws Exception {
        UpdateIPv6Response self = new UpdateIPv6Response();
        return TeaModel.build(map, self);
    }

    public UpdateIPv6Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIPv6Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIPv6Response setBody(UpdateIPv6ResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIPv6ResponseBody getBody() {
        return this.body;
    }

}
