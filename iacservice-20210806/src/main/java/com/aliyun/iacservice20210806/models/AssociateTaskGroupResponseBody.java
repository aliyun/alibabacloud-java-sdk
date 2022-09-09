// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AssociateTaskGroupResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static AssociateTaskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateTaskGroupResponseBody self = new AssociateTaskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateTaskGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
