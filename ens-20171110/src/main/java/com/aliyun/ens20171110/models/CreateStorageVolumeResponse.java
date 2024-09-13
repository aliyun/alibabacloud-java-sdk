// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateStorageVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStorageVolumeResponseBody body;

    public static CreateStorageVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageVolumeResponse self = new CreateStorageVolumeResponse();
        return TeaModel.build(map, self);
    }

    public CreateStorageVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStorageVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStorageVolumeResponse setBody(CreateStorageVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStorageVolumeResponseBody getBody() {
        return this.body;
    }

}
