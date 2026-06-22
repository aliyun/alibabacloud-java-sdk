// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotFeedbackResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.Map<String, Long> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static KopilotFeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KopilotFeedbackResponseBody self = new KopilotFeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public KopilotFeedbackResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public KopilotFeedbackResponseBody setData(java.util.Map<String, Long> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, Long> getData() {
        return this.data;
    }

    public KopilotFeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public KopilotFeedbackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
