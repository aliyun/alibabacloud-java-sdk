// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterSaveFlowConfigResponseBody extends TeaModel {
    @NameInMap("data")
    public ModelRouterSaveFlowConfigResponseBodyData data;

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

    public static ModelRouterSaveFlowConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterSaveFlowConfigResponseBody self = new ModelRouterSaveFlowConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterSaveFlowConfigResponseBody setData(ModelRouterSaveFlowConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterSaveFlowConfigResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterSaveFlowConfigResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterSaveFlowConfigResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterSaveFlowConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterSaveFlowConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterSaveFlowConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterSaveFlowConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-04-27T18:28:57.987356+08:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2026-04-27T18:28:57.987356+08:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>607</p>
         */
        @NameInMap("modelId")
        public Integer modelId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("rpm")
        public Integer rpm;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("smoothFlowEnabled")
        public Boolean smoothFlowEnabled;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("tpm")
        public Integer tpm;

        public static ModelRouterSaveFlowConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterSaveFlowConfigResponseBodyData self = new ModelRouterSaveFlowConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterSaveFlowConfigResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModelRouterSaveFlowConfigResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModelRouterSaveFlowConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModelRouterSaveFlowConfigResponseBodyData setModelId(Integer modelId) {
            this.modelId = modelId;
            return this;
        }
        public Integer getModelId() {
            return this.modelId;
        }

        public ModelRouterSaveFlowConfigResponseBodyData setRpm(Integer rpm) {
            this.rpm = rpm;
            return this;
        }
        public Integer getRpm() {
            return this.rpm;
        }

        public ModelRouterSaveFlowConfigResponseBodyData setSmoothFlowEnabled(Boolean smoothFlowEnabled) {
            this.smoothFlowEnabled = smoothFlowEnabled;
            return this;
        }
        public Boolean getSmoothFlowEnabled() {
            return this.smoothFlowEnabled;
        }

        public ModelRouterSaveFlowConfigResponseBodyData setTpm(Integer tpm) {
            this.tpm = tpm;
            return this;
        }
        public Integer getTpm() {
            return this.tpm;
        }

    }

}
