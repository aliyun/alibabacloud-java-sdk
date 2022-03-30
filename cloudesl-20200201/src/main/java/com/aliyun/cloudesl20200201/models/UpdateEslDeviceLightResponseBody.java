// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class UpdateEslDeviceLightResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("FailCount")
    public Integer failCount;

    @NameInMap("LightFailEslInfos")
    public java.util.List<UpdateEslDeviceLightResponseBodyLightFailEslInfos> lightFailEslInfos;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SuccessCount")
    public Integer successCount;

    public static UpdateEslDeviceLightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEslDeviceLightResponseBody self = new UpdateEslDeviceLightResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEslDeviceLightResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateEslDeviceLightResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public UpdateEslDeviceLightResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public UpdateEslDeviceLightResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateEslDeviceLightResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateEslDeviceLightResponseBody setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public UpdateEslDeviceLightResponseBody setLightFailEslInfos(java.util.List<UpdateEslDeviceLightResponseBodyLightFailEslInfos> lightFailEslInfos) {
        this.lightFailEslInfos = lightFailEslInfos;
        return this;
    }
    public java.util.List<UpdateEslDeviceLightResponseBodyLightFailEslInfos> getLightFailEslInfos() {
        return this.lightFailEslInfos;
    }

    public UpdateEslDeviceLightResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateEslDeviceLightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEslDeviceLightResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateEslDeviceLightResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public static class UpdateEslDeviceLightResponseBodyLightFailEslInfos extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("EslBarCode")
        public String eslBarCode;

        public static UpdateEslDeviceLightResponseBodyLightFailEslInfos build(java.util.Map<String, ?> map) throws Exception {
            UpdateEslDeviceLightResponseBodyLightFailEslInfos self = new UpdateEslDeviceLightResponseBodyLightFailEslInfos();
            return TeaModel.build(map, self);
        }

        public UpdateEslDeviceLightResponseBodyLightFailEslInfos setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UpdateEslDeviceLightResponseBodyLightFailEslInfos setEslBarCode(String eslBarCode) {
            this.eslBarCode = eslBarCode;
            return this;
        }
        public String getEslBarCode() {
            return this.eslBarCode;
        }

    }

}
