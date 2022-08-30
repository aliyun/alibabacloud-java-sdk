// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteCustomGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomGroupResponseBody self = new DeleteCustomGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
