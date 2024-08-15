// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class AddProblemServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddProblemServiceGroupResponseBody body;

    public static AddProblemServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProblemServiceGroupResponse self = new AddProblemServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddProblemServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProblemServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddProblemServiceGroupResponse setBody(AddProblemServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProblemServiceGroupResponseBody getBody() {
        return this.body;
    }

}
