// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDesktopUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    public static GetDesktopUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDesktopUsersResponseBody self = new GetDesktopUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDesktopUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDesktopUsersResponseBody setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

}
