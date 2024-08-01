// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyTaskInfoResponseBody extends TeaModel {
    /**
     * <p>The error code for the failed task. It is the same as that of the ModifyTaskInfo operation.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the failed task. The operation returns results after a task fails.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ErrorTaskId")
    public String errorTaskId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6163731A-XXXX-XXXX-B934-3388DE70C217</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of successful tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SuccessCount")
    public String successCount;

    public static ModifyTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTaskInfoResponseBody self = new ModifyTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTaskInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ModifyTaskInfoResponseBody setErrorTaskId(String errorTaskId) {
        this.errorTaskId = errorTaskId;
        return this;
    }
    public String getErrorTaskId() {
        return this.errorTaskId;
    }

    public ModifyTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTaskInfoResponseBody setSuccessCount(String successCount) {
        this.successCount = successCount;
        return this;
    }
    public String getSuccessCount() {
        return this.successCount;
    }

}
