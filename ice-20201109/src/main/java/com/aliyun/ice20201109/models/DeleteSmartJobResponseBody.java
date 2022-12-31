// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteSmartJobResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSmartJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmartJobResponseBody self = new DeleteSmartJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSmartJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
