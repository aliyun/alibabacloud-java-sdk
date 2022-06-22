// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class BatchEnableSentinelDefaultCircuitBreakerRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Integer data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchEnableSentinelDefaultCircuitBreakerRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchEnableSentinelDefaultCircuitBreakerRulesResponseBody self = new BatchEnableSentinelDefaultCircuitBreakerRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchEnableSentinelDefaultCircuitBreakerRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchEnableSentinelDefaultCircuitBreakerRulesResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public BatchEnableSentinelDefaultCircuitBreakerRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchEnableSentinelDefaultCircuitBreakerRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchEnableSentinelDefaultCircuitBreakerRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
