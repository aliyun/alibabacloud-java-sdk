// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachVServerGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachVServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachVServerGroupsResponseBody self = new AttachVServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachVServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
