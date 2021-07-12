// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorAvailableZonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIoTCloudConnectorAvailableZonesResponseBody body;

    public static ListIoTCloudConnectorAvailableZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorAvailableZonesResponse self = new ListIoTCloudConnectorAvailableZonesResponse();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorAvailableZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIoTCloudConnectorAvailableZonesResponse setBody(ListIoTCloudConnectorAvailableZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIoTCloudConnectorAvailableZonesResponseBody getBody() {
        return this.body;
    }

}
