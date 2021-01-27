// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAccelerateAreasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccelerateAreasResponseBody body;

    public static ListAccelerateAreasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccelerateAreasResponse self = new ListAccelerateAreasResponse();
        return TeaModel.build(map, self);
    }

    public ListAccelerateAreasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccelerateAreasResponse setBody(ListAccelerateAreasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccelerateAreasResponseBody getBody() {
        return this.body;
    }

}
