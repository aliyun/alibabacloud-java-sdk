// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyDesensitizationStrategyResponseBody extends TeaModel {
    /**
     * <p>ModifyDesensitizationStrategy</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>WB01220505</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Modifies the masking rule bound to a specified field.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyDesensitizationStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesensitizationStrategyResponseBody self = new ModifyDesensitizationStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDesensitizationStrategyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ModifyDesensitizationStrategyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ModifyDesensitizationStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDesensitizationStrategyResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public ModifyDesensitizationStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
