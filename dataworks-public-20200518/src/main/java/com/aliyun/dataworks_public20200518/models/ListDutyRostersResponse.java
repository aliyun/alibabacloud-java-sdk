// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDutyRostersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDutyRostersResponseBody body;

    public static ListDutyRostersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDutyRostersResponse self = new ListDutyRostersResponse();
        return TeaModel.build(map, self);
    }

    public ListDutyRostersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDutyRostersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDutyRostersResponse setBody(ListDutyRostersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDutyRostersResponseBody getBody() {
        return this.body;
    }

}
