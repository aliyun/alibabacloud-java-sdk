// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class ListInstancesV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstancesV2ResponseBody body;

    public static ListInstancesV2Response build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesV2Response self = new ListInstancesV2Response();
        return TeaModel.build(map, self);
    }

    public ListInstancesV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancesV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstancesV2Response setBody(ListInstancesV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancesV2ResponseBody getBody() {
        return this.body;
    }

}
