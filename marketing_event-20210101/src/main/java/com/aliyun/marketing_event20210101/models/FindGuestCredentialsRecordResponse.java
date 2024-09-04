// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class FindGuestCredentialsRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FindGuestCredentialsRecordResponseBody body;

    public static FindGuestCredentialsRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        FindGuestCredentialsRecordResponse self = new FindGuestCredentialsRecordResponse();
        return TeaModel.build(map, self);
    }

    public FindGuestCredentialsRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindGuestCredentialsRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindGuestCredentialsRecordResponse setBody(FindGuestCredentialsRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public FindGuestCredentialsRecordResponseBody getBody() {
        return this.body;
    }

}
