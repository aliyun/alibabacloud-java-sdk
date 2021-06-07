// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class GetUsersCountResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserCount")
    public Integer userCount;

    public static GetUsersCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUsersCountResponseBody self = new GetUsersCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUsersCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUsersCountResponseBody setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

}
