// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskContentV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskContentV2ResponseBody body;

    public static UpdateTaskContentV2Response build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskContentV2Response self = new UpdateTaskContentV2Response();
        return TeaModel.build(map, self);
    }

    public UpdateTaskContentV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskContentV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskContentV2Response setBody(UpdateTaskContentV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskContentV2ResponseBody getBody() {
        return this.body;
    }

}
