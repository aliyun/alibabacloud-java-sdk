// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteRegistrantProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRegistrantProfileResponseBody body;

    public static DeleteRegistrantProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistrantProfileResponse self = new DeleteRegistrantProfileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRegistrantProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRegistrantProfileResponse setBody(DeleteRegistrantProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRegistrantProfileResponseBody getBody() {
        return this.body;
    }

}
