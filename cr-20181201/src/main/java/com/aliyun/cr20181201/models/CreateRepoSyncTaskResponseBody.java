// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncTaskResponseBody extends TeaModel {
    /**
     * <p>Return value</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the invocation succeeded. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The invocation succeeded.</p>
     * </li>
     * <li><p><code>false</code>: Failed to invoke.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>8F8A0BA6-7F06-4BAE-B147-10BD6A25****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Sync task ID</p>
     * 
     * <strong>example:</strong>
     * <p>rst-gbch330f0c****</p>
     */
    @NameInMap("SyncTaskId")
    public String syncTaskId;

    public static CreateRepoSyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSyncTaskResponseBody self = new CreateRepoSyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRepoSyncTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRepoSyncTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CreateRepoSyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRepoSyncTaskResponseBody setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

}
