// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class InvokeFunctionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
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
