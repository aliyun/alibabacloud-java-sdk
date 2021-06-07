// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDesktopUsersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EndUserIds")
    @Validation(required = true)
    public java.util.List<String> endUserIds;

    public static GetDesktopUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDesktopUsersResponse self = new GetDesktopUsersResponse();
        return TeaModel.build(map, self);
    }

    public GetDesktopUsersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDesktopUsersResponse setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

}
