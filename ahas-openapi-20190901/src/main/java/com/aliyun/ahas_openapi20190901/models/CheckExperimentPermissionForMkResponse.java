// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CheckExperimentPermissionForMkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckExperimentPermissionForMkResponseBody body;

    public static CheckExperimentPermissionForMkResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckExperimentPermissionForMkResponse self = new CheckExperimentPermissionForMkResponse();
        return TeaModel.build(map, self);
    }

    public CheckExperimentPermissionForMkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckExperimentPermissionForMkResponse setBody(CheckExperimentPermissionForMkResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckExperimentPermissionForMkResponseBody getBody() {
        return this.body;
    }

}
