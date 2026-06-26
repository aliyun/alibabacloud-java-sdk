// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class FailurePermission extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>空</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>空</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The permission information.</p>
     */
    @NameInMap("permission")
    public Permission permission;

    public static FailurePermission build(java.util.Map<String, ?> map) throws Exception {
        FailurePermission self = new FailurePermission();
        return TeaModel.build(map, self);
    }

    public FailurePermission setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public FailurePermission setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public FailurePermission setPermission(Permission permission) {
        this.permission = permission;
        return this;
    }
    public Permission getPermission() {
        return this.permission;
    }

}
