// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class UpdateUserAuthResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateUserAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAuthResponseBody self = new UpdateUserAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserAuthResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateUserAuthResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateUserAuthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateUserAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserAuthResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
