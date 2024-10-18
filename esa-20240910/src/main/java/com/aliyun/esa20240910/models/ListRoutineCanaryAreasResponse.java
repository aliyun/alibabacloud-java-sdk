// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineCanaryAreasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRoutineCanaryAreasResponseBody body;

    public static ListRoutineCanaryAreasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineCanaryAreasResponse self = new ListRoutineCanaryAreasResponse();
        return TeaModel.build(map, self);
    }

    public ListRoutineCanaryAreasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoutineCanaryAreasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoutineCanaryAreasResponse setBody(ListRoutineCanaryAreasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoutineCanaryAreasResponseBody getBody() {
        return this.body;
    }

}
