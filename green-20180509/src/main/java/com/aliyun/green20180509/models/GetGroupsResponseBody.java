// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GetGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupsResponseBody self = new GetGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
