// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteSentinelDefaultCircuitBreakerRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Long data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteSentinelDefaultCircuitBreakerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSentinelDefaultCircuitBreakerRuleResponseBody self = new DeleteSentinelDefaultCircuitBreakerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSentinelDefaultCircuitBreakerRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSentinelDefaultCircuitBreakerRuleResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public DeleteSentinelDefaultCircuitBreakerRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSentinelDefaultCircuitBreakerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSentinelDefaultCircuitBreakerRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
