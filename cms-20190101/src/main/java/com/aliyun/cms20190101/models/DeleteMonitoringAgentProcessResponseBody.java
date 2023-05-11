// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitoringAgentProcessResponseBody extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **DeleteMonitoringAgentProcess**.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteMonitoringAgentProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitoringAgentProcessResponseBody self = new DeleteMonitoringAgentProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMonitoringAgentProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteMonitoringAgentProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMonitoringAgentProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMonitoringAgentProcessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
