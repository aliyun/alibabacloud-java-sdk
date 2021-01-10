// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RunFunctionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuntimeMeta")
    public RunFunctionResponseBodyRuntimeMeta runtimeMeta;

    @NameInMap("Result")
    public String result;

    public static RunFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunFunctionResponseBody self = new RunFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public RunFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunFunctionResponseBody setRuntimeMeta(RunFunctionResponseBodyRuntimeMeta runtimeMeta) {
        this.runtimeMeta = runtimeMeta;
        return this;
    }
    public RunFunctionResponseBodyRuntimeMeta getRuntimeMeta() {
        return this.runtimeMeta;
    }

    public RunFunctionResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public static class RunFunctionResponseBodyRuntimeMeta extends TeaModel {
        @NameInMap("InvocationDuration")
        public Integer invocationDuration;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("BillingDuration")
        public Integer billingDuration;

        @NameInMap("MaxMemoryUsage")
        public Integer maxMemoryUsage;

        public static RunFunctionResponseBodyRuntimeMeta build(java.util.Map<String, ?> map) throws Exception {
            RunFunctionResponseBodyRuntimeMeta self = new RunFunctionResponseBodyRuntimeMeta();
            return TeaModel.build(map, self);
        }

        public RunFunctionResponseBodyRuntimeMeta setInvocationDuration(Integer invocationDuration) {
            this.invocationDuration = invocationDuration;
            return this;
        }
        public Integer getInvocationDuration() {
            return this.invocationDuration;
        }

        public RunFunctionResponseBodyRuntimeMeta setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunFunctionResponseBodyRuntimeMeta setBillingDuration(Integer billingDuration) {
            this.billingDuration = billingDuration;
            return this;
        }
        public Integer getBillingDuration() {
            return this.billingDuration;
        }

        public RunFunctionResponseBodyRuntimeMeta setMaxMemoryUsage(Integer maxMemoryUsage) {
            this.maxMemoryUsage = maxMemoryUsage;
            return this;
        }
        public Integer getMaxMemoryUsage() {
            return this.maxMemoryUsage;
        }

    }

}
