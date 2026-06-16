// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AssetOptimizeLiteResponseBody extends TeaModel {
    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Asynchronous task submission result</p>
     */
    @NameInMap("Data")
    public AssetOptimizeLiteResponseBodyData data;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AssetOptimizeLiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssetOptimizeLiteResponseBody self = new AssetOptimizeLiteResponseBody();
        return TeaModel.build(map, self);
    }

    public AssetOptimizeLiteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AssetOptimizeLiteResponseBody setData(AssetOptimizeLiteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AssetOptimizeLiteResponseBodyData getData() {
        return this.data;
    }

    public AssetOptimizeLiteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AssetOptimizeLiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssetOptimizeLiteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AssetOptimizeLiteResponseBodyData extends TeaModel {
        /**
         * <p>Asynchronous task ID, used for subsequent result queries</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static AssetOptimizeLiteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AssetOptimizeLiteResponseBodyData self = new AssetOptimizeLiteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AssetOptimizeLiteResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
