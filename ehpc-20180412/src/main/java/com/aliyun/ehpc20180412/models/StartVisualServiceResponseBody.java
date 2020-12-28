// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartVisualServiceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static StartVisualServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartVisualServiceResponseBody self = new StartVisualServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartVisualServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartVisualServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
