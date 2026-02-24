// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDigitalEmployeeSkillVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDigitalEmployeeSkillVersionsResponseBody body;

    public static ListDigitalEmployeeSkillVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalEmployeeSkillVersionsResponse self = new ListDigitalEmployeeSkillVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDigitalEmployeeSkillVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDigitalEmployeeSkillVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDigitalEmployeeSkillVersionsResponse setBody(ListDigitalEmployeeSkillVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDigitalEmployeeSkillVersionsResponseBody getBody() {
        return this.body;
    }

}
