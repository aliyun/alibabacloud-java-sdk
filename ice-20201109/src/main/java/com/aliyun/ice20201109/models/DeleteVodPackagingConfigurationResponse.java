// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteVodPackagingConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVodPackagingConfigurationResponseBody body;

    public static DeleteVodPackagingConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodPackagingConfigurationResponse self = new DeleteVodPackagingConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVodPackagingConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVodPackagingConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVodPackagingConfigurationResponse setBody(DeleteVodPackagingConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVodPackagingConfigurationResponseBody getBody() {
        return this.body;
    }

}
