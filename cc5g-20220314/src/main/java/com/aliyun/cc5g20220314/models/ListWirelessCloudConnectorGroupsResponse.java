// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListWirelessCloudConnectorGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWirelessCloudConnectorGroupsResponseBody body;

    public static ListWirelessCloudConnectorGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWirelessCloudConnectorGroupsResponse self = new ListWirelessCloudConnectorGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListWirelessCloudConnectorGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWirelessCloudConnectorGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWirelessCloudConnectorGroupsResponse setBody(ListWirelessCloudConnectorGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWirelessCloudConnectorGroupsResponseBody getBody() {
        return this.body;
    }

}
