// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StartDesktopsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StartDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDesktopsResponse self = new StartDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public StartDesktopsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
