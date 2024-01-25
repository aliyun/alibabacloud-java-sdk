// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForSaveArtExtensionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForSaveArtExtensionResponseBody body;

    public static SaveSingleTaskForSaveArtExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForSaveArtExtensionResponse self = new SaveSingleTaskForSaveArtExtensionResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForSaveArtExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForSaveArtExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForSaveArtExtensionResponse setBody(SaveSingleTaskForSaveArtExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForSaveArtExtensionResponseBody getBody() {
        return this.body;
    }

}
