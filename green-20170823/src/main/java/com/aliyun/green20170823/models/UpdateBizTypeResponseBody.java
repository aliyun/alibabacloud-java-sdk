// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateBizTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBizTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTypeResponseBody self = new UpdateBizTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBizTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
