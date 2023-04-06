// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeApplicationFromGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeApplicationFromGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeApplicationFromGroupsResponseBody self = new RevokeApplicationFromGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeApplicationFromGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
