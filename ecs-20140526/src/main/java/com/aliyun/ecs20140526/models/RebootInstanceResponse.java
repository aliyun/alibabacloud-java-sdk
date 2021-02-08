// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RebootInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RebootInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootInstanceResponse self = new RebootInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RebootInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
