// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class OperateVulsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static OperateVulsResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateVulsResponse self = new OperateVulsResponse();
        return TeaModel.build(map, self);
    }

    public OperateVulsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
