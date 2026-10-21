// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SizeChartExtractAsyncResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned for normal calls.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The commit result of the size chart fetch asynchronous task node.</p>
     */
    @NameInMap("Data")
    public SizeChartExtractAsyncResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned for normal calls.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which is used to identify a unique request.</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true for success and false for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SizeChartExtractAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SizeChartExtractAsyncResponseBody self = new SizeChartExtractAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public SizeChartExtractAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SizeChartExtractAsyncResponseBody setData(SizeChartExtractAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SizeChartExtractAsyncResponseBodyData getData() {
        return this.data;
    }

    public SizeChartExtractAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SizeChartExtractAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SizeChartExtractAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SizeChartExtractAsyncResponseBodyData extends TeaModel {
        /**
         * <p>The task ID used to query the asynchronous task result.</p>
         * 
         * <strong>example:</strong>
         * <p>TID_550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SizeChartExtractAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SizeChartExtractAsyncResponseBodyData self = new SizeChartExtractAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SizeChartExtractAsyncResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
