// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleOverviewResponseBody extends TeaModel {
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

    public static SentinelDegradeRuleOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleOverviewResponseBody self = new SentinelDegradeRuleOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelDegradeRuleOverviewResponseBody setData(java.util.List<byte[]> data) {
        this.data = data;
        return this;
    }
    public java.util.List<byte[]> getData() {
        return this.data;
    }

    public SentinelDegradeRuleOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelDegradeRuleOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelDegradeRuleOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
