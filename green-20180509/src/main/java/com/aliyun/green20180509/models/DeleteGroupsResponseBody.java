// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupsResponseBody self = new DeleteGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
