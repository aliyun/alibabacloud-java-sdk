// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelWebFlowRuleOverviewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<byte[]> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelWebFlowRuleOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelWebFlowRuleOverviewResponseBody self = new SentinelWebFlowRuleOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelWebFlowRuleOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelWebFlowRuleOverviewResponseBody setData(java.util.List<byte[]> data) {
        this.data = data;
        return this;
    }
    public java.util.List<byte[]> getData() {
        return this.data;
    }

    public SentinelWebFlowRuleOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelWebFlowRuleOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelWebFlowRuleOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
