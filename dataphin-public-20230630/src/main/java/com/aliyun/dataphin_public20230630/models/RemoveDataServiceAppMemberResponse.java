// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveDataServiceAppMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveDataServiceAppMemberResponseBody body;

    public static RemoveDataServiceAppMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataServiceAppMemberResponse self = new RemoveDataServiceAppMemberResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDataServiceAppMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDataServiceAppMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDataServiceAppMemberResponse setBody(RemoveDataServiceAppMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDataServiceAppMemberResponseBody getBody() {
        return this.body;
    }

}
