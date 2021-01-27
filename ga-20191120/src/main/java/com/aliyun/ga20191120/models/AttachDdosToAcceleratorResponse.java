// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AttachDdosToAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachDdosToAcceleratorResponseBody body;

    public static AttachDdosToAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDdosToAcceleratorResponse self = new AttachDdosToAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public AttachDdosToAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDdosToAcceleratorResponse setBody(AttachDdosToAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDdosToAcceleratorResponseBody getBody() {
        return this.body;
    }

}
