// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteVideoDnaGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVideoDnaGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoDnaGroupResponseBody self = new DeleteVideoDnaGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVideoDnaGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
