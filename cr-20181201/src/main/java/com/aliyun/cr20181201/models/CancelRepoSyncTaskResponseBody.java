// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CancelRepoSyncTaskResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the CancelRepoSyncTask request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: successful</li>
     * <li><code>false</code>: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EB9C5722-51E2-4497-A573-575B0CA5CE0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelRepoSyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelRepoSyncTaskResponseBody self = new CancelRepoSyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelRepoSyncTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelRepoSyncTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CancelRepoSyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
