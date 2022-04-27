// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListWirelessCloudConnectorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListWirelessCloudConnectorsResponseBody body;

    public static ListWirelessCloudConnectorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWirelessCloudConnectorsResponse self = new ListWirelessCloudConnectorsResponse();
        return TeaModel.build(map, self);
    }

    public ListWirelessCloudConnectorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWirelessCloudConnectorsResponse setBody(ListWirelessCloudConnectorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWirelessCloudConnectorsResponseBody getBody() {
        return this.body;
    }

}
