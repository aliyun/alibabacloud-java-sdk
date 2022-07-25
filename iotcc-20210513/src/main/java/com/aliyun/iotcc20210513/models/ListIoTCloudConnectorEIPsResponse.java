// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorEIPsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIoTCloudConnectorEIPsResponseBody body;

    public static ListIoTCloudConnectorEIPsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorEIPsResponse self = new ListIoTCloudConnectorEIPsResponse();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorEIPsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIoTCloudConnectorEIPsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIoTCloudConnectorEIPsResponse setBody(ListIoTCloudConnectorEIPsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIoTCloudConnectorEIPsResponseBody getBody() {
        return this.body;
    }

}
