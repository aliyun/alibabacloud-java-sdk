// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotFeedbackResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned when the call is successful.</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, Long> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E522C7AB-AA99-53B1-BEE7-8BA83ED678F7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
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
