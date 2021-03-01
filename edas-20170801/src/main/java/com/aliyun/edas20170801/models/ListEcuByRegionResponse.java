// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcuByRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEcuByRegionResponseBody body;

    public static ListEcuByRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEcuByRegionResponse self = new ListEcuByRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListEcuByRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEcuByRegionResponse setBody(ListEcuByRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEcuByRegionResponseBody getBody() {
        return this.body;
    }

}
