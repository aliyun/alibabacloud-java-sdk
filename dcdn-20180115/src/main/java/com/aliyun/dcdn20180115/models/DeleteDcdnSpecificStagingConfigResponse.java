// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnSpecificStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDcdnSpecificStagingConfigResponseBody body;

    public static DeleteDcdnSpecificStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnSpecificStagingConfigResponse self = new DeleteDcdnSpecificStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnSpecificStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnSpecificStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnSpecificStagingConfigResponse setBody(DeleteDcdnSpecificStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnSpecificStagingConfigResponseBody getBody() {
        return this.body;
    }

}
