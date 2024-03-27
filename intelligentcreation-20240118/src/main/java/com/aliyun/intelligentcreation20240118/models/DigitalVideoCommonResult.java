// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class DigitalVideoCommonResult extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static DigitalVideoCommonResult build(java.util.Map<String, ?> map) throws Exception {
        DigitalVideoCommonResult self = new DigitalVideoCommonResult();
        return TeaModel.build(map, self);
    }

    public DigitalVideoCommonResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DigitalVideoCommonResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DigitalVideoCommonResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DigitalVideoCommonResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
