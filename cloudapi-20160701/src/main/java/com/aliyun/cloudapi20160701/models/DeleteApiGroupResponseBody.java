// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DeleteApiGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApiGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiGroupResponseBody self = new DeleteApiGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApiGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
