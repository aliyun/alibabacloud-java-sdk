// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListPhysicalSpacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPhysicalSpacesResponseBody body;

    public static ListPhysicalSpacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPhysicalSpacesResponse self = new ListPhysicalSpacesResponse();
        return TeaModel.build(map, self);
    }

    public ListPhysicalSpacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPhysicalSpacesResponse setBody(ListPhysicalSpacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPhysicalSpacesResponseBody getBody() {
        return this.body;
    }

}
