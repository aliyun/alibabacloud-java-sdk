// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class BatchRevokePermissionsResponseBody extends TeaModel {
    /**
     * <ul>
     * <li><p>If success is false, a business error message is returned.</p>
     * </li>
     * <li><p>If success is true, an empty value is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>空</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The results of permissions that failed to be revoked in batches.</p>
     */
    @NameInMap("failurePermissions")
    public java.util.List<FailurePermission> failurePermissions;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true: The API call is successful.</li>
     * <li>false: The API call failed.</li>
     * </ul>
     * 
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
