// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachTaskSessionResourceUsageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("audioUsage")
    public Integer audioUsage;

    /**
     * <strong>example:</strong>
     * <p>0：待扣费；1：完成扣费</p>
     */
    @NameInMap("deductionStatus")
    public Integer deductionStatus;

    /**
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>系统异常，请联系管理员</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4D902811-B75C-5D1B-8882-D515F8E2F977</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("tokenUsage")
    public Integer tokenUsage;

    public static GetAICoachTaskSessionResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachTaskSessionResourceUsageResponseBody self = new GetAICoachTaskSessionResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAICoachTaskSessionResourceUsageResponseBody setAudioUsage(Integer audioUsage) {
        this.audioUsage = audioUsage;
        return this;
    }
    public Integer getAudioUsage() {
        return this.audioUsage;
    }

    public GetAICoachTaskSessionResourceUsageResponseBody setDeductionStatus(Integer deductionStatus) {
        this.deductionStatus = deductionStatus;
        return this;
    }
    public Integer getDeductionStatus() {
        return this.deductionStatus;
    }

    public GetAICoachTaskSessionResourceUsageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAICoachTaskSessionResourceUsageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAICoachTaskSessionResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAICoachTaskSessionResourceUsageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAICoachTaskSessionResourceUsageResponseBody setTokenUsage(Integer tokenUsage) {
        this.tokenUsage = tokenUsage;
        return this;
    }
    public Integer getTokenUsage() {
        return this.tokenUsage;
    }

}
