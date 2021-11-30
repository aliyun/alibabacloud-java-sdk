// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceLogResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateResourceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceLogResponseBody self = new CreateResourceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateResourceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
