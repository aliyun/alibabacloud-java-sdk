// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchRecallPushResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Module")
    public BatchRecallPushResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>C39ECA8A-BB5E-4F92-B013-6A032FA06B04</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchRecallPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchRecallPushResponseBody self = new BatchRecallPushResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchRecallPushResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public BatchRecallPushResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchRecallPushResponseBody setModule(BatchRecallPushResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public BatchRecallPushResponseBodyModule getModule() {
        return this.module;
    }

    public BatchRecallPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchRecallPushResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchRecallPushResponseBodyModuleRecallResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>成功</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>NL20250508100515000002</p>
         */
        @NameInMap("OutBizId")
        public String outBizId;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static BatchRecallPushResponseBodyModuleRecallResults build(java.util.Map<String, ?> map) throws Exception {
            BatchRecallPushResponseBodyModuleRecallResults self = new BatchRecallPushResponseBodyModuleRecallResults();
            return TeaModel.build(map, self);
        }

        public BatchRecallPushResponseBodyModuleRecallResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchRecallPushResponseBodyModuleRecallResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchRecallPushResponseBodyModuleRecallResults setOutBizId(String outBizId) {
            this.outBizId = outBizId;
            return this;
        }
        public String getOutBizId() {
            return this.outBizId;
        }

        public BatchRecallPushResponseBodyModuleRecallResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class BatchRecallPushResponseBodyModule extends TeaModel {
        @NameInMap("RecallResults")
        public java.util.List<BatchRecallPushResponseBodyModuleRecallResults> recallResults;

        public static BatchRecallPushResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            BatchRecallPushResponseBodyModule self = new BatchRecallPushResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public BatchRecallPushResponseBodyModule setRecallResults(java.util.List<BatchRecallPushResponseBodyModuleRecallResults> recallResults) {
            this.recallResults = recallResults;
            return this;
        }
        public java.util.List<BatchRecallPushResponseBodyModuleRecallResults> getRecallResults() {
            return this.recallResults;
        }

    }

}
