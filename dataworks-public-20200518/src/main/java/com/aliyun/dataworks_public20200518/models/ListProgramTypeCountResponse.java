// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProgramTypeCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProgramTypeCountResponseBody body;

    public static ListProgramTypeCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProgramTypeCountResponse self = new ListProgramTypeCountResponse();
        return TeaModel.build(map, self);
    }

    public ListProgramTypeCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProgramTypeCountResponse setBody(ListProgramTypeCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProgramTypeCountResponseBody getBody() {
        return this.body;
    }

}
