// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SizeChartExtractResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The size chart extraction result.</p>
     */
    @NameInMap("Data")
    public SizeChartExtractResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
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
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SizeChartExtractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SizeChartExtractResponseBody self = new SizeChartExtractResponseBody();
        return TeaModel.build(map, self);
    }

    public SizeChartExtractResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SizeChartExtractResponseBody setData(SizeChartExtractResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SizeChartExtractResponseBodyData getData() {
        return this.data;
    }

    public SizeChartExtractResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SizeChartExtractResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SizeChartExtractResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SizeChartExtractResponseBodyData extends TeaModel {
        /**
         * <p>The asynchronous task ID, which is used to query the result later.</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SizeChartExtractResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SizeChartExtractResponseBodyData self = new SizeChartExtractResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SizeChartExtractResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
