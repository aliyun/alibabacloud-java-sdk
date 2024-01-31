// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyApplyV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightModifyApplyV2ResponseBody body;

    public static FlightModifyApplyV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyApplyV2Response self = new FlightModifyApplyV2Response();
        return TeaModel.build(map, self);
    }

    public FlightModifyApplyV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightModifyApplyV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightModifyApplyV2Response setBody(FlightModifyApplyV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightModifyApplyV2ResponseBody getBody() {
        return this.body;
    }

}
