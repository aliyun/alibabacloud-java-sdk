// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceServiceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceServiceConfigResponseBody body;

    public static ModifyInstanceServiceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceServiceConfigResponse self = new ModifyInstanceServiceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceServiceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceServiceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceServiceConfigResponse setBody(ModifyInstanceServiceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceServiceConfigResponseBody getBody() {
        return this.body;
    }

}
