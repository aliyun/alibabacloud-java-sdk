// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPidLoopLatestTaskStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Status")
    @Validation(required = true)
    public Boolean status;

    public static GetPidLoopLatestTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPidLoopLatestTaskStatusResponse self = new GetPidLoopLatestTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPidLoopLatestTaskStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPidLoopLatestTaskStatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPidLoopLatestTaskStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPidLoopLatestTaskStatusResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPidLoopLatestTaskStatusResponse setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
