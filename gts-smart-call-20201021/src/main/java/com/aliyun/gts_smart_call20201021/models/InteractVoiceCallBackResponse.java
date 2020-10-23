// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_smart_call20201021.models;

import com.aliyun.tea.*;

public class InteractVoiceCallBackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CallBackResult")
    @Validation(required = true)
    public String callBackResult;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    public static InteractVoiceCallBackResponse build(java.util.Map<String, ?> map) throws Exception {
        InteractVoiceCallBackResponse self = new InteractVoiceCallBackResponse();
        return TeaModel.build(map, self);
    }

    public InteractVoiceCallBackResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InteractVoiceCallBackResponse setCallBackResult(String callBackResult) {
        this.callBackResult = callBackResult;
        return this;
    }
    public String getCallBackResult() {
        return this.callBackResult;
    }

    public InteractVoiceCallBackResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
