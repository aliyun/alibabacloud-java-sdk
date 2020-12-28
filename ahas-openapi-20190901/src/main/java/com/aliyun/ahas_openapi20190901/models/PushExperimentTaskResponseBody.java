// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class PushExperimentTaskResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static PushExperimentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushExperimentTaskResponseBody self = new PushExperimentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public PushExperimentTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PushExperimentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushExperimentTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PushExperimentTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
