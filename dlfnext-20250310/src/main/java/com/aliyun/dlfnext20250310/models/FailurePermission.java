// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class FailurePermission extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

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
