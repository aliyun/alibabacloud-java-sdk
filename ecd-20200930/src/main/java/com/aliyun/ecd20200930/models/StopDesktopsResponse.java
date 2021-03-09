// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StopDesktopsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StopDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDesktopsResponse self = new StopDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public StopDesktopsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
