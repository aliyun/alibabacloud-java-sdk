// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class GetInstanceIdsByAliyunUidV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceIdsByAliyunUidV2ResponseBody body;

    public static GetInstanceIdsByAliyunUidV2Response build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIdsByAliyunUidV2Response self = new GetInstanceIdsByAliyunUidV2Response();
        return TeaModel.build(map, self);
    }

    public GetInstanceIdsByAliyunUidV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceIdsByAliyunUidV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceIdsByAliyunUidV2Response setBody(GetInstanceIdsByAliyunUidV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceIdsByAliyunUidV2ResponseBody getBody() {
        return this.body;
    }

}
