// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateDiskGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDiskGroupResponseBody body;

    public static UpdateDiskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDiskGroupResponse self = new UpdateDiskGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDiskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDiskGroupResponse setBody(UpdateDiskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDiskGroupResponseBody getBody() {
        return this.body;
    }

}
