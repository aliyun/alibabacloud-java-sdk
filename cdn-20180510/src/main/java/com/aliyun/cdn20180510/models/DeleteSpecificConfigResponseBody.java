// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteSpecificConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSpecificConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpecificConfigResponseBody self = new DeleteSpecificConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSpecificConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
