// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteQosPolicyResponseBody extends TeaModel {
    @NameInMap("ErrorMessages")
    public String errorMessages;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteQosPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQosPolicyResponseBody self = new DeleteQosPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQosPolicyResponseBody setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }
    public String getErrorMessages() {
        return this.errorMessages;
    }

    public DeleteQosPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
