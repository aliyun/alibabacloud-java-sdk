// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskDefaultKMSKeyIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDiskDefaultKMSKeyIdResponseBody body;

    public static ModifyDiskDefaultKMSKeyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskDefaultKMSKeyIdResponse self = new ModifyDiskDefaultKMSKeyIdResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskDefaultKMSKeyIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiskDefaultKMSKeyIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiskDefaultKMSKeyIdResponse setBody(ModifyDiskDefaultKMSKeyIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiskDefaultKMSKeyIdResponseBody getBody() {
        return this.body;
    }

}
