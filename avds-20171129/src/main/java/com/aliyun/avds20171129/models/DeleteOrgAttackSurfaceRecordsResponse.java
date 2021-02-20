// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteOrgAttackSurfaceRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOrgAttackSurfaceRecordsResponseBody body;

    public static DeleteOrgAttackSurfaceRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOrgAttackSurfaceRecordsResponse self = new DeleteOrgAttackSurfaceRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOrgAttackSurfaceRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOrgAttackSurfaceRecordsResponse setBody(DeleteOrgAttackSurfaceRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOrgAttackSurfaceRecordsResponseBody getBody() {
        return this.body;
    }

}
