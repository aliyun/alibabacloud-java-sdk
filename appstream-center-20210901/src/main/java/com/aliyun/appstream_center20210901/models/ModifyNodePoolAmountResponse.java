// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyNodePoolAmountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyNodePoolAmountResponseBody body;

    public static ModifyNodePoolAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodePoolAmountResponse self = new ModifyNodePoolAmountResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNodePoolAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNodePoolAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyNodePoolAmountResponse setBody(ModifyNodePoolAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNodePoolAmountResponseBody getBody() {
        return this.body;
    }

}
