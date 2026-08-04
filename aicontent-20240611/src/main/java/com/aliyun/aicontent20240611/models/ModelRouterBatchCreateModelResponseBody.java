// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchCreateModelResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ModelRouterBatchCreateModelResponseBodyData data;

    /**
     * <p>The fault code.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Unknown error</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterBatchCreateModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchCreateModelResponseBody self = new ModelRouterBatchCreateModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchCreateModelResponseBody setData(ModelRouterBatchCreateModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterBatchCreateModelResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterBatchCreateModelResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterBatchCreateModelResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterBatchCreateModelResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterBatchCreateModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterBatchCreateModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterBatchCreateModelResponseBodyData extends TeaModel {
        /**
         * <p>The list of models that were successfully created.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("created")
        public java.util.List<ModelDTO> created;

        /**
         * <p>The number of models that failed or were skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("failCount")
        public Integer failCount;

        /**
         * <p>The list of models that failed or were skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("failures")
        public java.util.List<BatchModelErrorDTO> failures;

        /**
         * <p>The number of models that were successfully created.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("successCount")
        public Integer successCount;

        public static ModelRouterBatchCreateModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterBatchCreateModelResponseBodyData self = new ModelRouterBatchCreateModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterBatchCreateModelResponseBodyData setCreated(java.util.List<ModelDTO> created) {
            this.created = created;
            return this;
        }
        public java.util.List<ModelDTO> getCreated() {
            return this.created;
        }

        public ModelRouterBatchCreateModelResponseBodyData setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public ModelRouterBatchCreateModelResponseBodyData setFailures(java.util.List<BatchModelErrorDTO> failures) {
            this.failures = failures;
            return this;
        }
        public java.util.List<BatchModelErrorDTO> getFailures() {
            return this.failures;
        }

        public ModelRouterBatchCreateModelResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

}
