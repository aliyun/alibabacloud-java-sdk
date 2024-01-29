// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSmartSysAvatarModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSmartSysAvatarModelsResponseBody body;

    public static ListSmartSysAvatarModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSmartSysAvatarModelsResponse self = new ListSmartSysAvatarModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListSmartSysAvatarModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSmartSysAvatarModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSmartSysAvatarModelsResponse setBody(ListSmartSysAvatarModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSmartSysAvatarModelsResponseBody getBody() {
        return this.body;
    }

}
