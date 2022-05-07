// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteIoTCloudConnetorBackhaulRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIoTCloudConnetorBackhaulRouteResponseBody body;

    public static DeleteIoTCloudConnetorBackhaulRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIoTCloudConnetorBackhaulRouteResponse self = new DeleteIoTCloudConnetorBackhaulRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIoTCloudConnetorBackhaulRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIoTCloudConnetorBackhaulRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIoTCloudConnetorBackhaulRouteResponse setBody(DeleteIoTCloudConnetorBackhaulRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIoTCloudConnetorBackhaulRouteResponseBody getBody() {
        return this.body;
    }

}
