// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateBizTypeTextLibResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBizTypeTextLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTypeTextLibResponseBody self = new UpdateBizTypeTextLibResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBizTypeTextLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
