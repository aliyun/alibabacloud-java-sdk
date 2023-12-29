// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class InvokeFunctionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>The time when the function is invoked. The format is **EEE,d MMM yyyy HH:mm:ss GMT**.</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>The invocation method. Valid values:</p>
     * <br>
     * <p>*   **Sync**: synchronous invocations</p>
     * <p>*   **Async**: asynchronous invocations</p>
     * <br>
     * <p>Default value: Sync</p>
     */
    @NameInMap("X-Fc-Invocation-Type")
    public String xFcInvocationType;

    /**
     * <p>The method used to return logs. Valid values:</p>
     * <br>
     * <p>*   **Tail**: returns the last 4 KB of logs that are generated for the current request.</p>
     * <p>*   **None**: No logs are returned for the current request. Default value: None.</p>
     */
    @NameInMap("X-Fc-Log-Type")
    public String xFcLogType;

    /**
     * <p>Specifies whether to enable the asynchronous task mode for requests. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter takes effect only for asynchronous invocations. It does not take effect for synchronous invocations.</p>
     */
    @NameInMap("X-Fc-Stateful-Async-Invocation-Enable")
    public String xFcStatefulAsyncInvocationEnable;

    /**
     * <p>The ID of the asynchronous task. You must enable the asynchronous task feature in advance.</p>
     * <br>
     * <p>> When you use an SDK to invoke a function, we recommend that you specify a business-related ID to facilitate subsequent operations. For example, you can use the video name as the invocation ID for a video-processing function. This way, you can use the ID to check whether the video is processed or terminate the processing of the video. The ID must start with a letter or an underscore (\_) and can contain letters, digits, underscores (\_), and hyphens (-). The ID can be up to 128 characters in length. If you do not specify the ID of the asynchronous invocation, Function Compute automatically generates an ID.</p>
     */
    @NameInMap("X-Fc-Stateful-Async-Invocation-Id")
    public String xFcStatefulAsyncInvocationId;

    /**
     * <p>The trace ID of the request for Function Compute API. The value is the same as that of the **requestId** parameter in the response.</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

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

    public InvokeFunctionHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
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

    public InvokeFunctionHeaders setXFcStatefulAsyncInvocationEnable(String xFcStatefulAsyncInvocationEnable) {
        this.xFcStatefulAsyncInvocationEnable = xFcStatefulAsyncInvocationEnable;
        return this;
    }
    public String getXFcStatefulAsyncInvocationEnable() {
        return this.xFcStatefulAsyncInvocationEnable;
    }

    public InvokeFunctionHeaders setXFcStatefulAsyncInvocationId(String xFcStatefulAsyncInvocationId) {
        this.xFcStatefulAsyncInvocationId = xFcStatefulAsyncInvocationId;
        return this;
    }
    public String getXFcStatefulAsyncInvocationId() {
        return this.xFcStatefulAsyncInvocationId;
    }

    public InvokeFunctionHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
