// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListZoneTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListZoneTypesResponseBody body;

    public static ListZoneTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListZoneTypesResponse self = new ListZoneTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListZoneTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListZoneTypesResponse setBody(ListZoneTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListZoneTypesResponseBody getBody() {
        return this.body;
    }

}
