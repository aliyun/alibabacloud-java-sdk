// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DissociateTaskGroupResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DissociateTaskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateTaskGroupResponseBody self = new DissociateTaskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateTaskGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
