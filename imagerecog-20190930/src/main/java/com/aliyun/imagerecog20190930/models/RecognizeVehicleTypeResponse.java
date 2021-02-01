// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeVehicleTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeVehicleTypeResponseBody body;

    public static RecognizeVehicleTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleTypeResponse self = new RecognizeVehicleTypeResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVehicleTypeResponse setBody(RecognizeVehicleTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVehicleTypeResponseBody getBody() {
        return this.body;
    }

}
