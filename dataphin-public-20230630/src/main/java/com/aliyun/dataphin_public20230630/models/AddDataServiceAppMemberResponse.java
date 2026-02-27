// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddDataServiceAppMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDataServiceAppMemberResponseBody body;

    public static AddDataServiceAppMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDataServiceAppMemberResponse self = new AddDataServiceAppMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddDataServiceAppMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDataServiceAppMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDataServiceAppMemberResponse setBody(AddDataServiceAppMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDataServiceAppMemberResponseBody getBody() {
        return this.body;
    }

}
