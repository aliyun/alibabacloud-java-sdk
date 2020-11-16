// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RebootDesktopsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RebootDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootDesktopsResponse self = new RebootDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public RebootDesktopsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
