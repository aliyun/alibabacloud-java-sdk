// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceIdByIdentitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceIdByIdentitiesResponseBody body;

    public static ListDeviceIdByIdentitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceIdByIdentitiesResponse self = new ListDeviceIdByIdentitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceIdByIdentitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceIdByIdentitiesResponse setBody(ListDeviceIdByIdentitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceIdByIdentitiesResponseBody getBody() {
        return this.body;
    }

}
