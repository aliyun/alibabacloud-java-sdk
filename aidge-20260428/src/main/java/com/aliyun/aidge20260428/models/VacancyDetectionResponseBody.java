// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VacancyDetectionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The submission result of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TaskId&quot;:&quot;TID_2f567233-78dd-4226-8b69-ac9288a66da0&quot;}</p>
     */
    @NameInMap("Data")
    public VacancyDetectionResponseBodyData data;

    /**
     * <p>The returned message or failure description.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
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

    public static VacancyDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VacancyDetectionResponseBody self = new VacancyDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public VacancyDetectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VacancyDetectionResponseBody setData(VacancyDetectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VacancyDetectionResponseBodyData getData() {
        return this.data;
    }

    public VacancyDetectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VacancyDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VacancyDetectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VacancyDetectionResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the asynchronous task. You can use this ID to query the result by calling QueryAsyncTaskResult later.</p>
         * 
         * <strong>example:</strong>
         * <p>518c7318185d4db694236f79d672c156</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The usage details. This field is left empty during asynchronous commit and is populated by scheduling after the node reaches the desired state.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static VacancyDetectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VacancyDetectionResponseBodyData self = new VacancyDetectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VacancyDetectionResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public VacancyDetectionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
