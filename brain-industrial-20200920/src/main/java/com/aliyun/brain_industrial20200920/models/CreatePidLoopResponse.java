// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePidLoopResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    public static CreatePidLoopResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePidLoopResponse self = new CreatePidLoopResponse();
        return TeaModel.build(map, self);
    }

    public CreatePidLoopResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePidLoopResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePidLoopResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePidLoopResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreatePidLoopResponse setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

}
