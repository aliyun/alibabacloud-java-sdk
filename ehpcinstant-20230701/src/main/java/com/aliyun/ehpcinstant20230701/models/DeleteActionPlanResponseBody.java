// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DeleteActionPlanResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteActionPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteActionPlanResponseBody self = new DeleteActionPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteActionPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
