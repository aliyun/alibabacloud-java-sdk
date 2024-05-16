// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgPlatformQueryProjectsAndSchemaFromMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody body;

    public static DsgPlatformQueryProjectsAndSchemaFromMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgPlatformQueryProjectsAndSchemaFromMetaResponse self = new DsgPlatformQueryProjectsAndSchemaFromMetaResponse();
        return TeaModel.build(map, self);
    }

    public DsgPlatformQueryProjectsAndSchemaFromMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgPlatformQueryProjectsAndSchemaFromMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgPlatformQueryProjectsAndSchemaFromMetaResponse setBody(DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgPlatformQueryProjectsAndSchemaFromMetaResponseBody getBody() {
        return this.body;
    }

}
