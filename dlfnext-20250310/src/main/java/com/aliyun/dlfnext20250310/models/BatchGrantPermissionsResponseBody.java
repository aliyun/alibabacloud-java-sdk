// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class BatchGrantPermissionsResponseBody extends TeaModel {
    /**
     * <p>The error message. This parameter is not empty when success is false, indicating a business error. This parameter is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>空</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The list of permissions that failed to be granted.</p>
     */
    @NameInMap("failurePermissions")
    public java.util.List<FailurePermission> failurePermissions;

    /**
     * <p>Indicates whether the API call was successful. Valid values:</p>
     * <ul>
     * <li>true: The API call was successful.</li>
     * <li>false: The API call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static BatchGrantPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGrantPermissionsResponseBody self = new BatchGrantPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGrantPermissionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGrantPermissionsResponseBody setFailurePermissions(java.util.List<FailurePermission> failurePermissions) {
        this.failurePermissions = failurePermissions;
        return this;
    }
    public java.util.List<FailurePermission> getFailurePermissions() {
        return this.failurePermissions;
    }

    public BatchGrantPermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
