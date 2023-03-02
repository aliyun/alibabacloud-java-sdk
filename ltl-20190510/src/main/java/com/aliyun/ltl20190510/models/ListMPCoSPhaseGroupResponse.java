// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListMPCoSPhaseGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMPCoSPhaseGroupResponseBody body;

    public static ListMPCoSPhaseGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMPCoSPhaseGroupResponse self = new ListMPCoSPhaseGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListMPCoSPhaseGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMPCoSPhaseGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMPCoSPhaseGroupResponse setBody(ListMPCoSPhaseGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMPCoSPhaseGroupResponseBody getBody() {
        return this.body;
    }

}
