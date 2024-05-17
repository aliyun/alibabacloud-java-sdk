// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyHadoopDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHadoopDataSourceResponseBody body;

    public static ModifyHadoopDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHadoopDataSourceResponse self = new ModifyHadoopDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHadoopDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHadoopDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHadoopDataSourceResponse setBody(ModifyHadoopDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHadoopDataSourceResponseBody getBody() {
        return this.body;
    }

}
