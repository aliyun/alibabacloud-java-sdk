// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexBackupGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFlexBackupGroupsResponseBody body;

    public static UpdateFlexBackupGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexBackupGroupsResponse self = new UpdateFlexBackupGroupsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlexBackupGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlexBackupGroupsResponse setBody(UpdateFlexBackupGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlexBackupGroupsResponseBody getBody() {
        return this.body;
    }

}
