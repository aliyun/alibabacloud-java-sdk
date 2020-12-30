// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForSaveArtExtensionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveSingleTaskForSaveArtExtensionResponse setBody(SaveSingleTaskForSaveArtExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForSaveArtExtensionResponseBody getBody() {
        return this.body;
    }

}
