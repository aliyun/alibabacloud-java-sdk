// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class BatchRevokePermissionsResponseBody extends TeaModel {
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("failurePermissions")
    public java.util.List<FailurePermission> failurePermissions;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static BatchRevokePermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchRevokePermissionsResponseBody self = new BatchRevokePermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchRevokePermissionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchRevokePermissionsResponseBody setFailurePermissions(java.util.List<FailurePermission> failurePermissions) {
        this.failurePermissions = failurePermissions;
        return this;
    }
    public java.util.List<FailurePermission> getFailurePermissions() {
        return this.failurePermissions;
    }

    public BatchRevokePermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
