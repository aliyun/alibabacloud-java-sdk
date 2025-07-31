// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddDataServiceProjectMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDataServiceProjectMemberResponseBody body;

    public static AddDataServiceProjectMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDataServiceProjectMemberResponse self = new AddDataServiceProjectMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddDataServiceProjectMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDataServiceProjectMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDataServiceProjectMemberResponse setBody(AddDataServiceProjectMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDataServiceProjectMemberResponseBody getBody() {
        return this.body;
    }

}
