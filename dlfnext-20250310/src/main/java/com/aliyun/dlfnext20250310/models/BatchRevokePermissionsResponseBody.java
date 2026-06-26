// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class BatchRevokePermissionsResponseBody extends TeaModel {
    /**
     * <ul>
     * <li><p>A business error message is returned if \<code>success\\</code> is \<code>false\\</code>.</p>
     * </li>
     * <li><p>This parameter is empty if \<code>success\\</code> is \<code>true\\</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>空</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The permissions failed to be revoked.</p>
     */
    @NameInMap("failurePermissions")
    public java.util.List<FailurePermission> failurePermissions;

    /**
     * <p>Indicates whether the call succeeded.</p>
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
