// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateDevicePurifyPlanResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static CreateDevicePurifyPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicePurifyPlanResponse self = new CreateDevicePurifyPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateDevicePurifyPlanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDevicePurifyPlanResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDevicePurifyPlanResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDevicePurifyPlanResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDevicePurifyPlanResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
