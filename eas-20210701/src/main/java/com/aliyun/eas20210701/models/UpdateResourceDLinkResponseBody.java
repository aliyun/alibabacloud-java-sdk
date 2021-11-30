// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceDLinkResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateResourceDLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceDLinkResponseBody self = new UpdateResourceDLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceDLinkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateResourceDLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
