// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SetDefaultRegistrantProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDefaultRegistrantProfileResponseBody body;

    public static SetDefaultRegistrantProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultRegistrantProfileResponse self = new SetDefaultRegistrantProfileResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultRegistrantProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultRegistrantProfileResponse setBody(SetDefaultRegistrantProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultRegistrantProfileResponseBody getBody() {
        return this.body;
    }

}
