// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class AddIpfilterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddIpfilterResponseBody body;

    public static AddIpfilterResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIpfilterResponse self = new AddIpfilterResponse();
        return TeaModel.build(map, self);
    }

    public AddIpfilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIpfilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddIpfilterResponse setBody(AddIpfilterResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIpfilterResponseBody getBody() {
        return this.body;
    }

}
