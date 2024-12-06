// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class SaveVirtualDatasourceDdlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveVirtualDatasourceDdlResponseBody body;

    public static SaveVirtualDatasourceDdlResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveVirtualDatasourceDdlResponse self = new SaveVirtualDatasourceDdlResponse();
        return TeaModel.build(map, self);
    }

    public SaveVirtualDatasourceDdlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveVirtualDatasourceDdlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveVirtualDatasourceDdlResponse setBody(SaveVirtualDatasourceDdlResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveVirtualDatasourceDdlResponseBody getBody() {
        return this.body;
    }

}
