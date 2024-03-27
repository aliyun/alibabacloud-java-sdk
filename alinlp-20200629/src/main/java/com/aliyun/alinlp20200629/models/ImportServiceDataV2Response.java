// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ImportServiceDataV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportServiceDataV2ResponseBody body;

    public static ImportServiceDataV2Response build(java.util.Map<String, ?> map) throws Exception {
        ImportServiceDataV2Response self = new ImportServiceDataV2Response();
        return TeaModel.build(map, self);
    }

    public ImportServiceDataV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportServiceDataV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportServiceDataV2Response setBody(ImportServiceDataV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportServiceDataV2ResponseBody getBody() {
        return this.body;
    }

}
