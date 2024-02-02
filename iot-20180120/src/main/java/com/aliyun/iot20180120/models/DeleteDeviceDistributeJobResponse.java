// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceDistributeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteDeviceDistributeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeviceDistributeJobResponse setBody(DeleteDeviceDistributeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceDistributeJobResponseBody getBody() {
        return this.body;
    }

}
