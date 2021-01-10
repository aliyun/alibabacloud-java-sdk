// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteProjectAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProjectAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectAppResponseBody self = new DeleteProjectAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProjectAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
