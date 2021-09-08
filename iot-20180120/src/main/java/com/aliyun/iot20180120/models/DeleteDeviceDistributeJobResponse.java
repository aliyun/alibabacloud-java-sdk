// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceDistributeJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeviceDistributeJobResponseBody body;

    public static DeleteDeviceDistributeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceDistributeJobResponse self = new DeleteDeviceDistributeJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceDistributeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceDistributeJobResponse setBody(DeleteDeviceDistributeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceDistributeJobResponseBody getBody() {
        return this.body;
    }

}
