// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardMappingToInvalidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStandardMappingToInvalidResponseBody body;

    public static UpdateStandardMappingToInvalidResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardMappingToInvalidResponse self = new UpdateStandardMappingToInvalidResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStandardMappingToInvalidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStandardMappingToInvalidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStandardMappingToInvalidResponse setBody(UpdateStandardMappingToInvalidResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStandardMappingToInvalidResponseBody getBody() {
        return this.body;
    }

}
