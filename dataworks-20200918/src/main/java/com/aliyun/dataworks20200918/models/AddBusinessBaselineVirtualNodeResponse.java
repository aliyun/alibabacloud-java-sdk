// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class AddBusinessBaselineVirtualNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBusinessBaselineVirtualNodeResponseBody body;

    public static AddBusinessBaselineVirtualNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBusinessBaselineVirtualNodeResponse self = new AddBusinessBaselineVirtualNodeResponse();
        return TeaModel.build(map, self);
    }

    public AddBusinessBaselineVirtualNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBusinessBaselineVirtualNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBusinessBaselineVirtualNodeResponse setBody(AddBusinessBaselineVirtualNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBusinessBaselineVirtualNodeResponseBody getBody() {
        return this.body;
    }

}
