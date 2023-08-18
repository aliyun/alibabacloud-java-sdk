// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class AddTaskJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddTaskJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTaskJobResponseBody self = new AddTaskJobResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTaskJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddTaskJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddTaskJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddTaskJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
