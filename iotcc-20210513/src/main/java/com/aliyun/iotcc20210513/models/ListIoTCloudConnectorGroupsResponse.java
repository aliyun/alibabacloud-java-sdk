// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIoTCloudConnectorGroupsResponseBody body;

    public static ListIoTCloudConnectorGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorGroupsResponse self = new ListIoTCloudConnectorGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIoTCloudConnectorGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIoTCloudConnectorGroupsResponse setBody(ListIoTCloudConnectorGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIoTCloudConnectorGroupsResponseBody getBody() {
        return this.body;
    }

}
