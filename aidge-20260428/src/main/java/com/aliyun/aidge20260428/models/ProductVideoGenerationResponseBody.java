// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ProductVideoGenerationResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task acceptance result.</p>
     */
    @NameInMap("Data")
    public ProductVideoGenerationResponseBodyData data;

    /**
     * <p>The returned message or failure description.</p>
     * 
     * <strong>example:</strong>
     * <p>Task submitted</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ProductVideoGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProductVideoGenerationResponseBody self = new ProductVideoGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public ProductVideoGenerationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProductVideoGenerationResponseBody setData(ProductVideoGenerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ProductVideoGenerationResponseBodyData getData() {
        return this.data;
    }

    public ProductVideoGenerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProductVideoGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProductVideoGenerationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ProductVideoGenerationResponseBodyData extends TeaModel {
        /**
         * <p>The planning path written upon acceptance. Valid values: DIRECT (with script) and AUTO_PLAN (automatic planning).</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO_PLAN</p>
         */
        @NameInMap("route")
        public String route;

        /**
         * <p>The current status.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The task ID of this service.</p>
         * 
         * <strong>example:</strong>
         * <p>task_778fa8bd21804828a5d147050e30edac</p>
         */
        @NameInMap("task_id")
        public String taskId;

        public static ProductVideoGenerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ProductVideoGenerationResponseBodyData self = new ProductVideoGenerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ProductVideoGenerationResponseBodyData setRoute(String route) {
            this.route = route;
            return this;
        }
        public String getRoute() {
            return this.route;
        }

        public ProductVideoGenerationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProductVideoGenerationResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
