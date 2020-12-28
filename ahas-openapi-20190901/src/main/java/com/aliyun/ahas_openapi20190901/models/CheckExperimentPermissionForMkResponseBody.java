// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CheckExperimentPermissionForMkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Permission")
    public Boolean permission;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static CheckExperimentPermissionForMkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckExperimentPermissionForMkResponseBody self = new CheckExperimentPermissionForMkResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckExperimentPermissionForMkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckExperimentPermissionForMkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckExperimentPermissionForMkResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CheckExperimentPermissionForMkResponseBody setPermission(Boolean permission) {
        this.permission = permission;
        return this;
    }
    public Boolean getPermission() {
        return this.permission;
    }

    public CheckExperimentPermissionForMkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckExperimentPermissionForMkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
