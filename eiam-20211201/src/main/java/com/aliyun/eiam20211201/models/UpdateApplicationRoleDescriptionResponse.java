// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationRoleDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationRoleDescriptionResponseBody body;

    public static UpdateApplicationRoleDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationRoleDescriptionResponse self = new UpdateApplicationRoleDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationRoleDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationRoleDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationRoleDescriptionResponse setBody(UpdateApplicationRoleDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationRoleDescriptionResponseBody getBody() {
        return this.body;
    }

}
