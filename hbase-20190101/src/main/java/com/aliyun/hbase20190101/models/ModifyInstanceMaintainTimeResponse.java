// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintainTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceMaintainTimeResponseBody body;

    public static ModifyInstanceMaintainTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMaintainTimeResponse self = new ModifyInstanceMaintainTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMaintainTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceMaintainTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceMaintainTimeResponse setBody(ModifyInstanceMaintainTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceMaintainTimeResponseBody getBody() {
        return this.body;
    }

}
