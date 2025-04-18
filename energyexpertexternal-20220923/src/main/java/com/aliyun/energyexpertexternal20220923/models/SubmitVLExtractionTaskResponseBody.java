// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitVLExtractionTaskResponseBody extends TeaModel {
    /**
     * <p>Returned data structure.</p>
     */
    @NameInMap("data")
    public SubmitVLExtractionTaskResponseBodyData data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SubmitVLExtractionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVLExtractionTaskResponseBody self = new SubmitVLExtractionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVLExtractionTaskResponseBody setData(SubmitVLExtractionTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitVLExtractionTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitVLExtractionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitVLExtractionTaskResponseBodyData extends TeaModel {
        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>411ce93a-7eb5-40cf-836a-53c32f097663</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitVLExtractionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitVLExtractionTaskResponseBodyData self = new SubmitVLExtractionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitVLExtractionTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
