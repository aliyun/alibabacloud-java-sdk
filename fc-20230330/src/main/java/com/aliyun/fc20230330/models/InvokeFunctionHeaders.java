// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class InvokeFunctionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The ID of the asynchronous task. You must enable the asynchronous task feature in advance.</p>
     * <blockquote>
     * <p> If you use an SDK to invoke a function, we recommend that you specify a business-related ID to facilitate subsequent operations. For example, a video processing function can use video file names as invocation IDs. This way, you can easily check whether a video is successfully processed or terminated before it is processed. The ID can start only with letters or underscores. An ID can contain <em>letters, digits (0 - 9), underscores</em>, and hyphens (-). It can be up to 128 characters in length. If you do not specify the ID of the asynchronous invocation, the system automatically generates an ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test-id</p>
     */
    @NameInMap("x-fc-async-task-id")
    public String xFcAsyncTaskId;

    /**
     * <p>The type of function invocation. Valid values: Sync and Async.</p>
     * 
     * <strong>example:</strong>
     * <p>Sync</p>
     */
    @NameInMap("x-fc-invocation-type")
    public String xFcInvocationType;

    /**
     * <p>The log type of function invocation. Valid values: None and Tail.</p>
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
