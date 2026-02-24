// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDigitalEmployeeSkillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDigitalEmployeeSkillsResponseBody body;

    public static ListDigitalEmployeeSkillsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalEmployeeSkillsResponse self = new ListDigitalEmployeeSkillsResponse();
        return TeaModel.build(map, self);
    }

    public ListDigitalEmployeeSkillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDigitalEmployeeSkillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDigitalEmployeeSkillsResponse setBody(ListDigitalEmployeeSkillsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDigitalEmployeeSkillsResponseBody getBody() {
        return this.body;
    }

}
