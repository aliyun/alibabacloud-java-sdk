// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveRegistrantProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveRegistrantProfileResponseBody body;

    public static SaveRegistrantProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveRegistrantProfileResponse self = new SaveRegistrantProfileResponse();
        return TeaModel.build(map, self);
    }

    public SaveRegistrantProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveRegistrantProfileResponse setBody(SaveRegistrantProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveRegistrantProfileResponseBody getBody() {
        return this.body;
    }

}
