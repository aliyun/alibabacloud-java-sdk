// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class InvokeFunctionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The ID of the asynchronous task. You must enable asynchronous tasks in advance.</p>
     * <blockquote>
     * <p>We recommend that you set a business-related ID when you use the SDK to invoke the function, which facilitates subsequent operations on the execution. For example, a video processing function can use the video file name as the invoke ID, through which you can check whether the video processing is complete or stop the video processing. The ID must start with an uppercase or lowercase letter or an underscore (<em>), and can contain uppercase and lowercase letters, digits (0-9), underscores (</em>), and hyphens (-). It can be up to 128 characters in length. If you do not specify an ID for the asynchronous invoke, the system automatically generates one.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test-id</p>
     */
    @NameInMap("x-fc-async-task-id")
    public String xFcAsyncTaskId;

    /**
     * <p>The function invoke type. Valid values: Sync and Async.</p>
     * 
     * <strong>example:</strong>
     * <p>Sync</p>
     */
    @NameInMap("x-fc-invocation-type")
    public String xFcInvocationType;

    /**
     * <p>The log type returned for function invoke. Valid values: None and Tail.</p>
     * 
     * <strong>example:</strong>
     * <p>Tail</p>
     */
    @NameInMap("x-fc-log-type")
    public String xFcLogType;

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

    public InvokeFunctionHeaders setXFcAsyncTaskId(String xFcAsyncTaskId) {
        this.xFcAsyncTaskId = xFcAsyncTaskId;
        return this;
    }
    public String getXFcAsyncTaskId() {
        return this.xFcAsyncTaskId;
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

}
