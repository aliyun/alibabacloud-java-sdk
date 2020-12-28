// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteBodyPersonResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBodyPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBodyPersonResponseBody self = new DeleteBodyPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBodyPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
