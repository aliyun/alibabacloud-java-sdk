// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class ListDomainUnitCellsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDomainUnitCellsResponseBody body;

    public static ListDomainUnitCellsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDomainUnitCellsResponse self = new ListDomainUnitCellsResponse();
        return TeaModel.build(map, self);
    }

    public ListDomainUnitCellsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDomainUnitCellsResponse setBody(ListDomainUnitCellsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDomainUnitCellsResponseBody getBody() {
        return this.body;
    }

}
