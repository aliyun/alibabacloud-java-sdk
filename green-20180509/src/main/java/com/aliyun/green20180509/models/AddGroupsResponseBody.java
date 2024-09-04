// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGroupsResponseBody self = new AddGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
