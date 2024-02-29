// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaTableIntroWikiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMetaTableIntroWikiResponseBody body;

    public static UpdateMetaTableIntroWikiResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaTableIntroWikiResponse self = new UpdateMetaTableIntroWikiResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetaTableIntroWikiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetaTableIntroWikiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMetaTableIntroWikiResponse setBody(UpdateMetaTableIntroWikiResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMetaTableIntroWikiResponseBody getBody() {
        return this.body;
    }

}
