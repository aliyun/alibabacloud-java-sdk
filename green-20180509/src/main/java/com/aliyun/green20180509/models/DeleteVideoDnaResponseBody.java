// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteVideoDnaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVideoDnaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoDnaResponseBody self = new DeleteVideoDnaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVideoDnaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
