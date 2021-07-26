// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListScheduleTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListScheduleTypesResponseBody body;

    public static ListScheduleTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleTypesResponse self = new ListScheduleTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduleTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduleTypesResponse setBody(ListScheduleTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduleTypesResponseBody getBody() {
        return this.body;
    }

}
