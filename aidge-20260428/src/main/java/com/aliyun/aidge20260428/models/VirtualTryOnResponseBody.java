// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VirtualTryOnResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result struct.</p>
     */
    @NameInMap("Data")
    public VirtualTryOnResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Used to uniquely identify a single API call.</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static VirtualTryOnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VirtualTryOnResponseBody self = new VirtualTryOnResponseBody();
        return TeaModel.build(map, self);
    }

    public VirtualTryOnResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VirtualTryOnResponseBody setData(VirtualTryOnResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VirtualTryOnResponseBodyData getData() {
        return this.data;
    }

    public VirtualTryOnResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VirtualTryOnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VirtualTryOnResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VirtualTryOnResponseBodyData extends TeaModel {
        /**
         * <p>The asynchronous task ID. Used to query the task result later.</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxxx-xxxx-xxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The usage details.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, ?> usageMap;

        public static VirtualTryOnResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VirtualTryOnResponseBodyData self = new VirtualTryOnResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VirtualTryOnResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public VirtualTryOnResponseBodyData setUsageMap(java.util.Map<String, ?> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, ?> getUsageMap() {
            return this.usageMap;
        }

    }

}
