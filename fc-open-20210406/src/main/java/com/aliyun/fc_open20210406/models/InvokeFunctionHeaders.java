// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class InvokeFunctionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // 用户 uid
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    // 调用方式:Sync或者Async，默认值：Sync
    @NameInMap("x-fc-invocation-type")
    public String xFcInvocationType;

    // 请求返回日志类型, Tail 为返回函数日志最后 4KB 数据，None 或空值则返回不带有日志，默认为 None
    @NameInMap("x-fc-log-type")
    public String xFcLogType;

    @NameInMap("x-fc-stateful-async-invocation-id")
    public String xFcStatefulAsyncInvocationId;

    public static InvokeFunctionHeaders build(java.util.Map<String, ?> map) throws Exception {
        InvokeFunctionHeaders self = new InvokeFunctionHeaders();
        return TeaModel.build(map, self);
    }

    public InvokeFunctionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InvokeFunctionHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public InvokeFunctionHeaders setXFcInvocationType(String xFcInvocationType) {
        this.xFcInvocationType = xFcInvocationType;
        return this;
    }
    public String getXFcInvocationType() {
        return this.xFcInvocationType;
    }

    public InvokeFunctionHeaders setXFcLogType(String xFcLogType) {
        this.xFcLogType = xFcLogType;
        return this;
    }
    public String getXFcLogType() {
        return this.xFcLogType;
    }

    public InvokeFunctionHeaders setXFcStatefulAsyncInvocationId(String xFcStatefulAsyncInvocationId) {
        this.xFcStatefulAsyncInvocationId = xFcStatefulAsyncInvocationId;
        return this;
    }
    public String getXFcStatefulAsyncInvocationId() {
        return this.xFcStatefulAsyncInvocationId;
    }

}
