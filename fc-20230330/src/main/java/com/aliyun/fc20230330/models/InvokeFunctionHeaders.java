// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class InvokeFunctionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>Asynchronous task ID. Enable asynchronous tasks beforehand.</p>
     * <blockquote>
     * <p>When using the SDK for invocation, set a business-related ID. This helps with subsequent operations on the execution. For example, a video processing function can use the video filename as the invocation ID. Use this ID to check if the video processing is complete or to stop it. The ID naming convention must start with an English letter (uppercase or lowercase) or an underscore (<em>). It can contain English letters (uppercase or lowercase), digits (0-9), underscores (</em>), and hyphens (-). The ID cannot exceed 128 characters. If you do not set an ID for asynchronous invocation, the system automatically generates one.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test-id</p>
     */
    @NameInMap("x-fc-async-task-id")
    public String xFcAsyncTaskId;

    /**
     * <p>Function invocation type. Sync or Async.</p>
     * 
     * <strong>example:</strong>
     * <p>Sync</p>
     */
    @NameInMap("x-fc-invocation-type")
    public String xFcInvocationType;

    /**
     * <p>Log type returned by function invocation. None or Tail.</p>
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
