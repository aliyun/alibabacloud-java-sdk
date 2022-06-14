// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetDesktopsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetDesktopsResponseBody self = new ResetDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
