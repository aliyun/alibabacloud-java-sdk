// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateQosPolicyResponseBody extends TeaModel {
    @NameInMap("ErrorMessages")
    public String errorMessages;

    @NameInMap("QosPolicyId")
    public String qosPolicyId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateQosPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQosPolicyResponseBody self = new CreateQosPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQosPolicyResponseBody setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }
    public String getErrorMessages() {
        return this.errorMessages;
    }

    public CreateQosPolicyResponseBody setQosPolicyId(String qosPolicyId) {
        this.qosPolicyId = qosPolicyId;
        return this;
    }
    public String getQosPolicyId() {
        return this.qosPolicyId;
    }

    public CreateQosPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
