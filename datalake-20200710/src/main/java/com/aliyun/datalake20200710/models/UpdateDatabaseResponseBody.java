// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateDatabaseResponseBody extends TeaModel {
    // Response Code
    @NameInMap("Code")
    public String code;

    // Response Message
    @NameInMap("Message")
    public String message;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Request is success or not
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatabaseResponseBody self = new UpdateDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDatabaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDatabaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
