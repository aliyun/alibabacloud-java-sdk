// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListPSMemberDataTypeCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPSMemberDataTypeCodeResponseBody body;

    public static ListPSMemberDataTypeCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPSMemberDataTypeCodeResponse self = new ListPSMemberDataTypeCodeResponse();
        return TeaModel.build(map, self);
    }

    public ListPSMemberDataTypeCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPSMemberDataTypeCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPSMemberDataTypeCodeResponse setBody(ListPSMemberDataTypeCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPSMemberDataTypeCodeResponseBody getBody() {
        return this.body;
    }

}
