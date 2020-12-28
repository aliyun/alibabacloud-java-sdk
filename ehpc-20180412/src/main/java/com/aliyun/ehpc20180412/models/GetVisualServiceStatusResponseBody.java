// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetVisualServiceStatusResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVisualServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVisualServiceStatusResponseBody self = new GetVisualServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVisualServiceStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVisualServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
