// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class UpdateMediaCoverResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMediaCoverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaCoverResponseBody self = new UpdateMediaCoverResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaCoverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
