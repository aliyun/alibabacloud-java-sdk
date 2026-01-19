// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCloudAccountRoleDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudAccountRoleDescriptionResponseBody body;

    public static UpdateCloudAccountRoleDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudAccountRoleDescriptionResponse self = new UpdateCloudAccountRoleDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudAccountRoleDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudAccountRoleDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudAccountRoleDescriptionResponse setBody(UpdateCloudAccountRoleDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudAccountRoleDescriptionResponseBody getBody() {
        return this.body;
    }

}
