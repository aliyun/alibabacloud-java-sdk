// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountActivatedOrNewRegistrationDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountActivatedOrNewRegistrationDeviceResponseBody body;

    public static CountActivatedOrNewRegistrationDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CountActivatedOrNewRegistrationDeviceResponse self = new CountActivatedOrNewRegistrationDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CountActivatedOrNewRegistrationDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountActivatedOrNewRegistrationDeviceResponse setBody(CountActivatedOrNewRegistrationDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public CountActivatedOrNewRegistrationDeviceResponseBody getBody() {
        return this.body;
    }

}
