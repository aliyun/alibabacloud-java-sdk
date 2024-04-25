// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class StartDesktopsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDesktopsResponseBody self = new StartDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
