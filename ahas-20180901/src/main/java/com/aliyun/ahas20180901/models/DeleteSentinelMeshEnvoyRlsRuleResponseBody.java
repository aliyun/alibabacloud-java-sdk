// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteSentinelMeshEnvoyRlsRuleResponseBody extends TeaModel {
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

    public static DeleteSentinelMeshEnvoyRlsRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSentinelMeshEnvoyRlsRuleResponseBody self = new DeleteSentinelMeshEnvoyRlsRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSentinelMeshEnvoyRlsRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSentinelMeshEnvoyRlsRuleResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public DeleteSentinelMeshEnvoyRlsRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSentinelMeshEnvoyRlsRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSentinelMeshEnvoyRlsRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
