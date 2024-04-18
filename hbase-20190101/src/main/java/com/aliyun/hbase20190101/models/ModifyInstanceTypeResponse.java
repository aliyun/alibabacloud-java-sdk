// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceTypeResponseBody body;

    public static ModifyInstanceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTypeResponse self = new ModifyInstanceTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceTypeResponse setBody(ModifyInstanceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceTypeResponseBody getBody() {
        return this.body;
    }

}
