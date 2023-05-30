// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetStatefulAsyncInvocationHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The list of events that trigger the asynchronous task.</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>The structure of the asynchronous task.</p>
     */
    @NameInMap("X-Fc-Code-Checksum")
    public String xFcCodeChecksum;

    /**
     * <p>Alibaba Cloud provides SDKs for multiple programming languages to help you integrate Alibaba Cloud services by using APIs. We recommend that you use an SDK to call API operations. This frees you from manual signature verification.</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>StatefulAsyncInvocation: asynchronous task. Asynchronous tasks allow you to manage the states on the basis of common asynchronous invocations, which is more suitable for task scenarios.</p>
     */
    @NameInMap("X-Fc-Invocation-Type")
    public String xFcInvocationType;

    /**
     * <p>The latest version of Function Compute API.</p>
     */
    @NameInMap("X-Fc-Log-Type")
    public String xFcLogType;

    /**
     * <p>You can search for API operations, call and debug API operations online, and dynamically generate executable sample code for SDKs.</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static GetStatefulAsyncInvocationHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetStatefulAsyncInvocationHeaders self = new GetStatefulAsyncInvocationHeaders();
        return TeaModel.build(map, self);
    }

    public GetStatefulAsyncInvocationHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetStatefulAsyncInvocationHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public GetStatefulAsyncInvocationHeaders setXFcCodeChecksum(String xFcCodeChecksum) {
        this.xFcCodeChecksum = xFcCodeChecksum;
        return this;
    }
    public String getXFcCodeChecksum() {
        return this.xFcCodeChecksum;
    }

    public GetStatefulAsyncInvocationHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public GetStatefulAsyncInvocationHeaders setXFcInvocationType(String xFcInvocationType) {
        this.xFcInvocationType = xFcInvocationType;
        return this;
    }
    public String getXFcInvocationType() {
        return this.xFcInvocationType;
    }

    public GetStatefulAsyncInvocationHeaders setXFcLogType(String xFcLogType) {
        this.xFcLogType = xFcLogType;
        return this;
    }
    public String getXFcLogType() {
        return this.xFcLogType;
    }

    public GetStatefulAsyncInvocationHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
