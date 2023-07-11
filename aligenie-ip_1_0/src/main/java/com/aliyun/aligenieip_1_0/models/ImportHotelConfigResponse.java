// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportHotelConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportHotelConfigResponseBody body;

    public static ImportHotelConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportHotelConfigResponse self = new ImportHotelConfigResponse();
        return TeaModel.build(map, self);
    }

    public ImportHotelConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportHotelConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportHotelConfigResponse setBody(ImportHotelConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportHotelConfigResponseBody getBody() {
        return this.body;
    }

}
