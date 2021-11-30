// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceInstancesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResourceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceInstancesResponseBody self = new DeleteResourceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteResourceInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
