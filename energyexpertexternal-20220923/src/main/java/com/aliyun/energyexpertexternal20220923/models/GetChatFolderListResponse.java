// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetChatFolderListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatFolderListResponseBody body;

    public static GetChatFolderListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatFolderListResponse self = new GetChatFolderListResponse();
        return TeaModel.build(map, self);
    }

    public GetChatFolderListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatFolderListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatFolderListResponse setBody(GetChatFolderListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatFolderListResponseBody getBody() {
        return this.body;
    }

}
