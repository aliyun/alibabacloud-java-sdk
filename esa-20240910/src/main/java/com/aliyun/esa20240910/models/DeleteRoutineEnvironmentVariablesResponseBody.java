// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineEnvironmentVariablesResponseBody extends TeaModel {
    /**
     * <p>The list of environment variable keys that were deleted successfully.</p>
     */
    @NameInMap("DeletedKeys")
    public java.util.List<String> deletedKeys;

    /**
     * <p>The list of environment variable keys that failed to be deleted.</p>
     */
    @NameInMap("FailedKeys")
    public java.util.List<String> failedKeys;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRoutineEnvironmentVariablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineEnvironmentVariablesResponseBody self = new DeleteRoutineEnvironmentVariablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineEnvironmentVariablesResponseBody setDeletedKeys(java.util.List<String> deletedKeys) {
        this.deletedKeys = deletedKeys;
        return this;
    }
    public java.util.List<String> getDeletedKeys() {
        return this.deletedKeys;
    }

    public DeleteRoutineEnvironmentVariablesResponseBody setFailedKeys(java.util.List<String> failedKeys) {
        this.failedKeys = failedKeys;
        return this;
    }
    public java.util.List<String> getFailedKeys() {
        return this.failedKeys;
    }

    public DeleteRoutineEnvironmentVariablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
