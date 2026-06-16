// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AssetOptimizeProResponseBody extends TeaModel {
    /**
     * <p>The status code. The value &quot;success&quot; is returned for a successful call.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result data of the asynchronous task submission, which contains the asynchronous task ID.</p>
     */
    @NameInMap("Data")
    public AssetOptimizeProResponseBodyData data;

    /**
     * <p>The error message. The value &quot;Success&quot; is returned for a successful call.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which uniquely identifies the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>4FCCA90A-A7A4-1D37-88C3-C17549886E70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AssetOptimizeProResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssetOptimizeProResponseBody self = new AssetOptimizeProResponseBody();
        return TeaModel.build(map, self);
    }

    public AssetOptimizeProResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AssetOptimizeProResponseBody setData(AssetOptimizeProResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AssetOptimizeProResponseBodyData getData() {
        return this.data;
    }

    public AssetOptimizeProResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AssetOptimizeProResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssetOptimizeProResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AssetOptimizeProResponseBodyData extends TeaModel {
        /**
         * <p>The asynchronous task ID, which is used to query the processing result by calling QueryAsyncTaskResult.</p>
         * 
         * <strong>example:</strong>
         * <p>8080345d-b28a-9e2e-9ad7-370f8e236949</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static AssetOptimizeProResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AssetOptimizeProResponseBodyData self = new AssetOptimizeProResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AssetOptimizeProResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
