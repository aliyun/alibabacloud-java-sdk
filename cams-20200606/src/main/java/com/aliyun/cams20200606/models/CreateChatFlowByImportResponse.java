// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatFlowByImportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChatFlowByImportResponseBody body;

    public static CreateChatFlowByImportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChatFlowByImportResponse self = new CreateChatFlowByImportResponse();
        return TeaModel.build(map, self);
    }

    public CreateChatFlowByImportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChatFlowByImportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChatFlowByImportResponse setBody(CreateChatFlowByImportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChatFlowByImportResponseBody getBody() {
        return this.body;
    }

}
