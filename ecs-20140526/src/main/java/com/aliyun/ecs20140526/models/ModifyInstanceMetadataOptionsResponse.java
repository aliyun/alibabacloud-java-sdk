// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceMetadataOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceMetadataOptionsResponseBody body;

    public static ModifyInstanceMetadataOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMetadataOptionsResponse self = new ModifyInstanceMetadataOptionsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMetadataOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceMetadataOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceMetadataOptionsResponse setBody(ModifyInstanceMetadataOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceMetadataOptionsResponseBody getBody() {
        return this.body;
    }

}
