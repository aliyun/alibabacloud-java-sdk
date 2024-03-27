// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataTrackOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataTrackOrderResponseBody body;

    public static CreateDataTrackOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataTrackOrderResponse self = new CreateDataTrackOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataTrackOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataTrackOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataTrackOrderResponse setBody(CreateDataTrackOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataTrackOrderResponseBody getBody() {
        return this.body;
    }

}
