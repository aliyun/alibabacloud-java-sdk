// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class AddTextFeedbackResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static AddTextFeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTextFeedbackResponseBody self = new AddTextFeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTextFeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddTextFeedbackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
