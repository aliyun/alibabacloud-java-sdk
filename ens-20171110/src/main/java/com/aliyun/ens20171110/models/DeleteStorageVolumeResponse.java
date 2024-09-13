// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteStorageVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStorageVolumeResponseBody body;

    public static DeleteStorageVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageVolumeResponse self = new DeleteStorageVolumeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStorageVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStorageVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStorageVolumeResponse setBody(DeleteStorageVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStorageVolumeResponseBody getBody() {
        return this.body;
    }

}
