// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SyncUsersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SyncUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncUsersResponseBody self = new SyncUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
