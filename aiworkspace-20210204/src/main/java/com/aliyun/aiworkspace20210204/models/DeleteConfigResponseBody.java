// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigResponseBody self = new DeleteConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
