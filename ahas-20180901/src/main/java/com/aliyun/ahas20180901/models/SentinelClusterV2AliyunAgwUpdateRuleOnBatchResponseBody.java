// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponseBody extends TeaModel {
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

    public static SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponseBody self = new SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelClusterV2AliyunAgwUpdateRuleOnBatchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
