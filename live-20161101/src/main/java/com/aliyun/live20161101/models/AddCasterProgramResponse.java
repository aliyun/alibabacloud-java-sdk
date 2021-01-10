// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterProgramResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCasterProgramResponseBody body;

    public static AddCasterProgramResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterProgramResponse self = new AddCasterProgramResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterProgramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCasterProgramResponse setBody(AddCasterProgramResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCasterProgramResponseBody getBody() {
        return this.body;
    }

}
