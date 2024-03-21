// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnWafGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDcdnWafGroupResponseBody body;

    public static DeleteDcdnWafGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnWafGroupResponse self = new DeleteDcdnWafGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnWafGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnWafGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnWafGroupResponse setBody(DeleteDcdnWafGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnWafGroupResponseBody getBody() {
        return this.body;
    }

}
