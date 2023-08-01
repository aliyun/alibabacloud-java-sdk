// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportRoomGenieScenesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportRoomGenieScenesResponseBody body;

    public static ImportRoomGenieScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportRoomGenieScenesResponse self = new ImportRoomGenieScenesResponse();
        return TeaModel.build(map, self);
    }

    public ImportRoomGenieScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportRoomGenieScenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportRoomGenieScenesResponse setBody(ImportRoomGenieScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportRoomGenieScenesResponseBody getBody() {
        return this.body;
    }

}
