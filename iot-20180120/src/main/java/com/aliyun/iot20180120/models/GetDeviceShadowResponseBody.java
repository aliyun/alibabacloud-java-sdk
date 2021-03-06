// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDeviceShadowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ShadowMessage")
    public String shadowMessage;

    public static GetDeviceShadowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceShadowResponseBody self = new GetDeviceShadowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceShadowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceShadowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDeviceShadowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceShadowResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeviceShadowResponseBody setShadowMessage(String shadowMessage) {
        this.shadowMessage = shadowMessage;
        return this;
    }
    public String getShadowMessage() {
        return this.shadowMessage;
    }

}
