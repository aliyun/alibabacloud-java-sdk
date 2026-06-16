// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VisionFlowResponseBody extends TeaModel {
    /**
     * <p>The status code. The value &quot;success&quot; is returned for a successful call.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The submit status data of the asynchronous task, which contains the asynchronous task ID.</p>
     */
    @NameInMap("Data")
    public VisionFlowResponseBodyData data;

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
     * <p>F3E65785-0180-1227-91B0-2F5F52F679FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static VisionFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VisionFlowResponseBody self = new VisionFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public VisionFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VisionFlowResponseBody setData(VisionFlowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VisionFlowResponseBodyData getData() {
        return this.data;
    }

    public VisionFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VisionFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VisionFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VisionFlowResponseBodyData extends TeaModel {
        /**
         * <p>The asynchronous task ID. Use this ID to query the processing result through QueryAsyncTaskResult.</p>
         * 
         * <strong>example:</strong>
         * <p>e4c48e88-3c34-91e3-ab8a-08484dc4d402</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static VisionFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VisionFlowResponseBodyData self = new VisionFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VisionFlowResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
