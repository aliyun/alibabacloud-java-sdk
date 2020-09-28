// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetLoopParameterStepResponse extends TeaModel {
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

    @NameInMap("PidLoopParamTurningStep")
    @Validation(required = true)
    public Integer pidLoopParamTurningStep;

    public static GetLoopParameterStepResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoopParameterStepResponse self = new GetLoopParameterStepResponse();
        return TeaModel.build(map, self);
    }

    public GetLoopParameterStepResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoopParameterStepResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLoopParameterStepResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLoopParameterStepResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLoopParameterStepResponse setPidLoopParamTurningStep(Integer pidLoopParamTurningStep) {
        this.pidLoopParamTurningStep = pidLoopParamTurningStep;
        return this;
    }
    public Integer getPidLoopParamTurningStep() {
        return this.pidLoopParamTurningStep;
    }

}
