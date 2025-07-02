// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UserBatchJoinGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7A2C3803-C975-5871-A232-80A91009****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UserBatchJoinGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserBatchJoinGroupResponseBody self = new UserBatchJoinGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UserBatchJoinGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
