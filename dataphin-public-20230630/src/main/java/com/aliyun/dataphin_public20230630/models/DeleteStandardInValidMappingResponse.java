// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteStandardInValidMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStandardInValidMappingResponseBody body;

    public static DeleteStandardInValidMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardInValidMappingResponse self = new DeleteStandardInValidMappingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStandardInValidMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStandardInValidMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStandardInValidMappingResponse setBody(DeleteStandardInValidMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStandardInValidMappingResponseBody getBody() {
        return this.body;
    }

}
