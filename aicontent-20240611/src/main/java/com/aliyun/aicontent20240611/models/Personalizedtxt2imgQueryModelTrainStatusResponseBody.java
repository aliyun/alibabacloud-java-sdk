// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgQueryModelTrainStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public Personalizedtxt2imgQueryModelTrainStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static Personalizedtxt2imgQueryModelTrainStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgQueryModelTrainStatusResponseBody self = new Personalizedtxt2imgQueryModelTrainStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgQueryModelTrainStatusResponseBody setData(Personalizedtxt2imgQueryModelTrainStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public Personalizedtxt2imgQueryModelTrainStatusResponseBodyData getData() {
        return this.data;
    }

    public Personalizedtxt2imgQueryModelTrainStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public Personalizedtxt2imgQueryModelTrainStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public Personalizedtxt2imgQueryModelTrainStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public Personalizedtxt2imgQueryModelTrainStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Personalizedtxt2imgQueryModelTrainStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Personalizedtxt2imgQueryModelTrainStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("modelTrainStatus")
        public String modelTrainStatus;

        public static Personalizedtxt2imgQueryModelTrainStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            Personalizedtxt2imgQueryModelTrainStatusResponseBodyData self = new Personalizedtxt2imgQueryModelTrainStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public Personalizedtxt2imgQueryModelTrainStatusResponseBodyData setModelTrainStatus(String modelTrainStatus) {
            this.modelTrainStatus = modelTrainStatus;
            return this;
        }
        public String getModelTrainStatus() {
            return this.modelTrainStatus;
        }

    }

}
