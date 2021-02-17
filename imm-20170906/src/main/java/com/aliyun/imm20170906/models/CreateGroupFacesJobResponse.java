// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateGroupFacesJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGroupFacesJobResponseBody body;

    public static CreateGroupFacesJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupFacesJobResponse self = new CreateGroupFacesJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupFacesJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupFacesJobResponse setBody(CreateGroupFacesJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupFacesJobResponseBody getBody() {
        return this.body;
    }

}
