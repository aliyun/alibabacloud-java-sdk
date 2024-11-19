// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ModifyLindormV2InstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLindormV2InstanceResponseBody body;

    public static ModifyLindormV2InstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLindormV2InstanceResponse self = new ModifyLindormV2InstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLindormV2InstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLindormV2InstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLindormV2InstanceResponse setBody(ModifyLindormV2InstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLindormV2InstanceResponseBody getBody() {
        return this.body;
    }

}
