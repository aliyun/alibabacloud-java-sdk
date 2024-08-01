// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class OpenApiSingleResponse extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public OpenApiSingleResponseData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static OpenApiSingleResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiSingleResponse self = new OpenApiSingleResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiSingleResponse setData(OpenApiSingleResponseData data) {
        this.data = data;
        return this;
    }
    public OpenApiSingleResponseData getData() {
        return this.data;
    }

    public OpenApiSingleResponse setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public OpenApiSingleResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public OpenApiSingleResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public OpenApiSingleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenApiSingleResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OpenApiSingleResponseData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("modelTrainStatus")
        public String modelTrainStatus;

        public static OpenApiSingleResponseData build(java.util.Map<String, ?> map) throws Exception {
            OpenApiSingleResponseData self = new OpenApiSingleResponseData();
            return TeaModel.build(map, self);
        }

        public OpenApiSingleResponseData setModelTrainStatus(String modelTrainStatus) {
            this.modelTrainStatus = modelTrainStatus;
            return this;
        }
        public String getModelTrainStatus() {
            return this.modelTrainStatus;
        }

    }

}
