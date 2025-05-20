// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class BatchGrantPermissionsResponseBody extends TeaModel {
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("failurePermissions")
    public java.util.List<FailurePermission> failurePermissions;

    /**
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
