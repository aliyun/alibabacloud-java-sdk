// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserIdResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the CloudSSO user.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdResponseBody self = new GetUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserIdResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
