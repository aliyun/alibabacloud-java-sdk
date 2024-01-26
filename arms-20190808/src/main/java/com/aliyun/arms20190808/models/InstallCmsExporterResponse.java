// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallCmsExporterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallCmsExporterResponseBody body;

    public static InstallCmsExporterResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallCmsExporterResponse self = new InstallCmsExporterResponse();
        return TeaModel.build(map, self);
    }

    public InstallCmsExporterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallCmsExporterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallCmsExporterResponse setBody(InstallCmsExporterResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallCmsExporterResponseBody getBody() {
        return this.body;
    }

}
