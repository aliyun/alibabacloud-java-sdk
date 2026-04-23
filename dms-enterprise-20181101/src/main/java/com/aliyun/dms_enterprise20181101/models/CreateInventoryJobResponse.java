// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateInventoryJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInventoryJobResponseBody body;

    public static CreateInventoryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInventoryJobResponse self = new CreateInventoryJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateInventoryJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInventoryJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInventoryJobResponse setBody(CreateInventoryJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInventoryJobResponseBody getBody() {
        return this.body;
    }

}
