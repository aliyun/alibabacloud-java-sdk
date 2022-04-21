// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorAccessSessionLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIoTCloudConnectorAccessSessionLogsResponseBody body;

    public static ListIoTCloudConnectorAccessSessionLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorAccessSessionLogsResponse self = new ListIoTCloudConnectorAccessSessionLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorAccessSessionLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIoTCloudConnectorAccessSessionLogsResponse setBody(ListIoTCloudConnectorAccessSessionLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIoTCloudConnectorAccessSessionLogsResponseBody getBody() {
        return this.body;
    }

}
