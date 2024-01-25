// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AddAccessControlListEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAccessControlListEntryResponseBody body;

    public static AddAccessControlListEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAccessControlListEntryResponse self = new AddAccessControlListEntryResponse();
        return TeaModel.build(map, self);
    }

    public AddAccessControlListEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAccessControlListEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAccessControlListEntryResponse setBody(AddAccessControlListEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAccessControlListEntryResponseBody getBody() {
        return this.body;
    }

}
