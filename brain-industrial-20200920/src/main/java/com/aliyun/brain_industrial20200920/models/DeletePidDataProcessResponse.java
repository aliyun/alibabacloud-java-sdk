// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class DeletePidDataProcessResponse extends TeaModel {
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

    @NameInMap("PidData")
    @Validation(required = true)
    public String pidData;

    public static DeletePidDataProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePidDataProcessResponse self = new DeletePidDataProcessResponse();
        return TeaModel.build(map, self);
    }

    public DeletePidDataProcessResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePidDataProcessResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeletePidDataProcessResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeletePidDataProcessResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeletePidDataProcessResponse setPidData(String pidData) {
        this.pidData = pidData;
        return this;
    }
    public String getPidData() {
        return this.pidData;
    }

}
