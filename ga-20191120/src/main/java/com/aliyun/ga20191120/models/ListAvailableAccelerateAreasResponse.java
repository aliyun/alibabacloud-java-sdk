// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAvailableAccelerateAreasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAvailableAccelerateAreasResponseBody body;

    public static ListAvailableAccelerateAreasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableAccelerateAreasResponse self = new ListAvailableAccelerateAreasResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableAccelerateAreasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableAccelerateAreasResponse setBody(ListAvailableAccelerateAreasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableAccelerateAreasResponseBody getBody() {
        return this.body;
    }

}
