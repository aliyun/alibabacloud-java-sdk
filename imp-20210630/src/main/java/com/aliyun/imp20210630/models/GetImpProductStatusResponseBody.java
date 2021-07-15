// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetImpProductStatusResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 开通状态
    @NameInMap("Result")
    public Boolean result;

    public static GetImpProductStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImpProductStatusResponseBody self = new GetImpProductStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImpProductStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImpProductStatusResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
