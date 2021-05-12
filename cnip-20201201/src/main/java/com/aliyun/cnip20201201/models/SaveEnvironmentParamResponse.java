// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class SaveEnvironmentParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveEnvironmentParamResponseBody body;

    public static SaveEnvironmentParamResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveEnvironmentParamResponse self = new SaveEnvironmentParamResponse();
        return TeaModel.build(map, self);
    }

    public SaveEnvironmentParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveEnvironmentParamResponse setBody(SaveEnvironmentParamResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveEnvironmentParamResponseBody getBody() {
        return this.body;
    }

}
