// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataServiceAppMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataServiceAppMemberResponseBody body;

    public static UpdateDataServiceAppMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataServiceAppMemberResponse self = new UpdateDataServiceAppMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataServiceAppMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataServiceAppMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataServiceAppMemberResponse setBody(UpdateDataServiceAppMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataServiceAppMemberResponseBody getBody() {
        return this.body;
    }

}
