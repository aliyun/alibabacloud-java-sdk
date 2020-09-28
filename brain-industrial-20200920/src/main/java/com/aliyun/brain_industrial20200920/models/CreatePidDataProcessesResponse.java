// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePidDataProcessesResponse extends TeaModel {
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

    @NameInMap("PidDataProcessIdList")
    @Validation(required = true)
    public java.util.List<String> pidDataProcessIdList;

    public static CreatePidDataProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePidDataProcessesResponse self = new CreatePidDataProcessesResponse();
        return TeaModel.build(map, self);
    }

    public CreatePidDataProcessesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePidDataProcessesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePidDataProcessesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePidDataProcessesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreatePidDataProcessesResponse setPidDataProcessIdList(java.util.List<String> pidDataProcessIdList) {
        this.pidDataProcessIdList = pidDataProcessIdList;
        return this;
    }
    public java.util.List<String> getPidDataProcessIdList() {
        return this.pidDataProcessIdList;
    }

}
