// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListVoiceModelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>040002</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Failed to proxy flink ui request, message: An error occurred: Invalid UUID string: jobsn</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("list")
    public java.util.List<VoiceModelResponse> list;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>14878724-A835-578D-9DD5-4779ADCE9221</p>
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
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListVoiceModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceModelsResponseBody self = new ListVoiceModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoiceModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoiceModelsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListVoiceModelsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListVoiceModelsResponseBody setList(java.util.List<VoiceModelResponse> list) {
        this.list = list;
        return this;
    }
    public java.util.List<VoiceModelResponse> getList() {
        return this.list;
    }

    public ListVoiceModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVoiceModelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListVoiceModelsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
